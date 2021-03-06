package driver_management;
import behaviours.*;

public class Driver {

  String name;
  Driveable drive;

  public Driver(String name, Driveable drive) {
    this.name = name;
    this.drive = drive;
  }

  public String getName() {
    return this.name;
  }

  public int driveTime(int distance) {
    return this.drive.driveTime(distance);
  }

  public int averageSpeed() {
    return this.drive.getAverageSpeed();
  }

  public void setDrive(Driveable drive) {
    this.drive = drive;
  }

}