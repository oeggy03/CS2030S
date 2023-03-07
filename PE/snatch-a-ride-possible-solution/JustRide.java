class JustRide extends Service {
  static final int RATE = 22;
  static final int SURCHARGE = 500;

  @Override
  public int computeFare(Request request) {
    return request.getDistance() * RATE +
      (request.getTime() >= 600 && request.getTime() <= 900 ? SURCHARGE : 0);
  }

  @Override
  public String toString() {
    return "JustRide";
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof JustRide);
  }
}
