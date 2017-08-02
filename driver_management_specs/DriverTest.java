import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  QuadBike bike;
  DodgemCar car;

  @Before
  public void before() {
    bike = new QuadBike(30, 200);
    car = new DodgemCar(10, 2);
    driver = new Driver("Dave", bike);
  }

  @Test
  public void driverHasName() {
    assertEquals("Dave", driver.getName());
  }

  @Test
  public void checkDriveTime() {
    assertEquals(1, driver.driveTime(30));
  }



}