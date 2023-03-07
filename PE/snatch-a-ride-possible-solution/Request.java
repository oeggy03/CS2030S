public class Request {
  private int distance;
  private int numOfPassengers;
  private int time;

  public Request(int distance, int numOfPassengers, int time) {
    this.distance = distance;
    this.numOfPassengers = numOfPassengers;
    this.time = time;
  }

  public int getDistance() {
    return this.distance;
  }

  public int getNumOfPassengers() {
    return this.numOfPassengers;
  }

  public int getTime() {
    return this.time;
  }

  public String toString() {
    return getDistance() + "km for " +
      getNumOfPassengers() + "pax @ " +
      getTime() + "hrs";
  }
}

