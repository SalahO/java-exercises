package server_exercise.common;

import java.util.List;

import exercise_4.domain.Car;
import exercise_4.domain.Motorcycle;
import exercise_4.domain.Truck;
import exercise_4.domain.Vehicle;

public interface VehicleServiceInterface {

  List<Vehicle> byMake(String make);

  List<Vehicle> byModel(String model);

  List<Vehicle> byColor(String color);

  List<Car> allCars();

  List<Motorcycle> allMotorcycles();

  List<Truck> allTrucks();

  List<Vehicle> allVehicles();

}
