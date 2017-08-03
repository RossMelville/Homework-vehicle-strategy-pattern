package driver_management;
import behaviours.*;

public class QuadBike extends Vehicle implements Driveable {

  private int engineCapacity;
  

  public QuadBike(int averageSpeed, int engineCapacity) {
    super(averageSpeed);
    this.engineCapacity = engineCapacity; 
  }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }


}