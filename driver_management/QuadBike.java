package driver_management;
import behaviours.*;

public class QuadBike implements Driveable {

  private int averageSpeed;
  private int engineCapacity;

  public QuadBike(int averageSpeed, int engineCapacity) {
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

  public int getAverageSpeed() {
    return this.averageSpeed;
  }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }


}