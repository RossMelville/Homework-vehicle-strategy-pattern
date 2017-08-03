import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  QuadBike bike;
  DodgemCar car;
  Tractor tractor;

  @Before
  public void before() {
    bike = new QuadBike(30, 200);
    car = new DodgemCar(10, 2, "Electric");
    tractor = new Tractor(15, true);
    driver = new Driver("Dave", bike);
  }

  @Test
  public void driverHasName() {
    assertEquals("Dave", driver.getName());
  }

  @Test
  public void checkDriveTimeBike() {
    assertEquals(1, driver.driveTime(30));
  }

  @Test
  public void checkDriveTimeCar() {
    driver = new Driver("Bob", car);
    assertEquals(2, driver.driveTime(20));
  }

  @Test
  public void checkAverageSpeedOfDrive() {
    assertEquals(30, driver.averageSpeed());
  }

  @Test
  public void canUpdateDriveable() {
    driver.setDrive(car);
    assertEquals(10, driver.averageSpeed());
  }


}