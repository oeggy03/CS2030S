import java.util.List;

class Cab extends Driver {
  Cab(String plate, int waitingTime) {
    super(plate, waitingTime, List.of(new TakeACab(), new JustRide()));
  }

  @Override
  public String toString() {
    return "Cab " + super.toString();
  }
}
