package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private String motor;

  public DodgemCar(int averageSpeed, int seats, String motor) {
    super(averageSpeed, seats);
    this.motor = motor;
  }
 


}