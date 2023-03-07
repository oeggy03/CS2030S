class ShareARide extends Service {
  static final int RATE = 50;
  static final int SURCHARGE = 500;

  @Override
  public int computeFare(Request request) {
    return (request.getDistance() * RATE +
        (request.getTime() >= 600 && request.getTime() <= 900 ? SURCHARGE : 0)) / 
        request.getNumOfPassengers();
  }

  @Override
  public String toString() {
    return "ShareARide";
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ShareARide);
  }
}
