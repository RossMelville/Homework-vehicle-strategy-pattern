package driver_management;

public abstract class Vehicle {

  int averageSpeed;
  int seats;

  public Vehicle(int averageSpeed, int seats) {
    this.averageSpeed = averageSpeed;
    this.seats = seats;
  }

  public int getAverageSpeed() {
    return this.averageSpeed;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

  public int getSeats() {
    return this.seats;
  }


}