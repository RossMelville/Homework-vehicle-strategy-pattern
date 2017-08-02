package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private int averageSpeed;
  private int seats;

  public DodgemCar(int averageSpeed, int seats) {
    super(averageSpeed);
    this.seats = seats;
  }

  public int getSeats() {
    return this.seats;
  }



}