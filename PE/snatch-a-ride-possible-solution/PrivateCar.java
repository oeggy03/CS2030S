import java.util.List;

class PrivateCar extends Driver {
  public PrivateCar(String id, int waitingTime) {
    super(id, waitingTime, List.of(new JustRide(), new ShareARide()));
  }

  @Override
  public String toString() {
    return "PrivateCar " + super.toString();
  }
}
