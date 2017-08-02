package driver_management;

public abstract class Vehicle {

  int averageSpeed;

  public Vehicle(int averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public int getAverageSpeed() {
    return this.averageSpeed;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

}