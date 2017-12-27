package exercises_1_2.domain;

import java.util.ArrayList;
import java.util.List;

public class Parking {

  private final int capacity;
  private final List<Vehicle> parkedVehicles;

  public Parking(int capacity) {
    this.capacity = capacity;
    this.parkedVehicles = new ArrayList<Vehicle>();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public List<Vehicle> getParkedVehicles() {
    return this.parkedVehicles;
  }

  public boolean park(Vehicle v) {
    if (this.parkedVehicles.size() < this.capacity && !this.parkedVehicles.contains(v))
      return this.parkedVehicles.add(v);

    return false;
  }

  public boolean remove(Vehicle v) {
    return this.parkedVehicles.remove(v);
  }

  public int parkedVehicleCount() {
    return this.parkedVehicles.size();
  }

  public int availableSlots() {
    return this.capacity - this.parkedVehicleCount();
  }

  public long parkedVehiclesWeightSum() {
    return this.parkedVehicles.stream().map(Vehicle::getWeight).reduce((w1, w2) -> w1 + w2).orElse(0);
  }
}
