package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private int seats;
  private String motor;

  public DodgemCar(int averageSpeed, int seats, String motor) {
    super(averageSpeed);
    this.seats =seats;
    this.motor = motor;
  }


  public int getSeats() {
    return this.seats;
  }
 
  



}