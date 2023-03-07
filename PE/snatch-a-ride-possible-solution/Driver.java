import java.util.List;

abstract class Driver implements Comparable<Driver> {
  private final int waitingTime;
  private final String id;
  private final List<Service> services;

  protected Driver(String id, int waitingTime, List<Service> services) {
    this.id = id;
    this.waitingTime = waitingTime;
    this.services = services;
  }

  protected int getWaitingTime() {
    return this.waitingTime;
  }

  public int compareTo(Driver d) {
    if (this.waitingTime == d.waitingTime) {
      return this.id.compareTo(d.id);
    } else {
      return this.waitingTime - d.waitingTime;
    }
  }

  public List<Service> getServices() {
    return this.services;
  }

  public boolean canProvideService(Service thatService)  {
    for (Service s : this.services) {
      if (s.equals(thatService)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    int time = this.getWaitingTime();
    if (time == 1) {
      return this.id + " (" + getWaitingTime() + " min away)";
    } else {
      return this.id + " (" + getWaitingTime() + " mins away)";
    }
  }

}
