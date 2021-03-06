import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar car;

    @Before
    public void before() {
      car = new DodgemCar(10, 2, "Electric");
    }

    @Test
    public void driveDistanceReturnsTime() {
      assertEquals(1, car.driveTime(10));
    }

    @Test
    public void canGetSeats() {
      assertEquals(2, car.getSeats());
    }

    @Test
    public void canGetAverageSpeed() {
      assertEquals(10, car.getAverageSpeed());
    }


}