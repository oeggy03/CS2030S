import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.List;

class Booking implements Comparable<Booking> {
  private Driver driver;
  private Service service;
  private int fare;

  public Booking(Driver driver, Service service, Request request) {
    this.driver = driver;
    this.service = service;
    if (!driver.canProvideService(service)) {
      throw new IllegalArgumentException(driver + " does not provide the " + service + " service.");
    }
    this.fare = service.computeFare(request);
  }

  public static List<Booking> getMatches(Driver driver, Request request) {
    List<Booking> bookings = new ArrayList<Booking>();
    for (Service service : driver.getServices()) {
      bookings.add(new Booking(driver, service, request));
    }
    return bookings;
  }

  public int compareTo(Booking b) {
    if (this.fare == b.fare) {
      return this.driver.compareTo(b.driver);
    } else {
      return this.fare - b.fare;
    }
  }

  public String toString() {
    return String.format("$%.2f using ", fare / 100.0) + driver + " (" + this.service + ")";
  }
}
