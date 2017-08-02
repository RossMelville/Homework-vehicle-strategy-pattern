package driver_management;
import behaviours.*;

public class Tractor extends Vehicle implements Driveable {

  private int averageSpeed;
  private boolean trailer;

  public Tractor(int averageSpeed, boolean trailer) {
    super(averageSpeed);
    this.trailer = trailer;
  }
  


}