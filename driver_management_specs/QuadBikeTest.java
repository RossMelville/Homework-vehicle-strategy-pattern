import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike bike;

  @Before
  public void before() {
    bike = new QuadBike(30, 2, 200);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, bike.driveTime(30));
  }

  @Test
  public void canGetAverageSpeed() {
    assertEquals(30, bike.getAverageSpeed());
  }

  @Test 
  public void canGetEngineCapacity() {
    assertEquals(200, bike.getEngineCapacity());
  }


}