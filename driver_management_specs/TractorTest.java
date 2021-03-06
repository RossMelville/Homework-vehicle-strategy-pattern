import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class TractorTest {

  Tractor tractor;

  @Before
  public void before() {
    tractor = new Tractor(15, 1, true);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(2, tractor.driveTime(30));
  }

  @Test
  public void canGetAverageSpeed() {
    assertEquals(15, tractor.getAverageSpeed());
  }

  @Test
  public void canCheckTractorHasTrailer() {
    assertEquals(true, tractor.hasTrailer());
  }

  @Test
  public void canCheckTractorHasNoTrailer() {
    tractor = new Tractor(15, 1, false);
    assertEquals(false, tractor.hasTrailer());
  }

}