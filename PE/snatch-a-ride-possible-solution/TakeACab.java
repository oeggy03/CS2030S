class TakeACab extends Service {
  static final int RATE = 33;
  static final int MINFARE = 200;

  @Override
  public int computeFare(Request request) {
    return MINFARE + request.getDistance() * RATE;
  }

  @Override
  public String toString() {
    return "TakeACab";
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof TakeACab;
  }
}
