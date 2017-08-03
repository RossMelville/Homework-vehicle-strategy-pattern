package driver_management;
import behaviours.*;

public class Tractor extends Vehicle implements Driveable {

  private boolean trailer;

  public Tractor(int averageSpeed, boolean trailer) {
    super(averageSpeed);
    this.trailer = trailer;
  }

  public boolean hasTrailer() {
    return this.trailer;
  }


}