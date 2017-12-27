package exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

import exercise_4.domain.Floor;
import exercise_4.domain.Parking;
import exercise_4.domain.Truck;
import exercise_4.domain.Vehicle;

public class ParkingUtils {

  public static <T> List<T> streamToList(Stream<T> stream) {
    // TODO
    // Hint : you want to collect them all into a list
    return null;
  }

  public static <T> Set<T> streamToSet(Stream<T> stream) {
    // TODO
    // Hint : you want to collect them all into a Set
    return null;
  }

  public static Map<String, Vehicle> mapMakeModelWithVehicle(Stream<Vehicle> vehicles) {
    Function<Vehicle, String> vehicleToMakeModel = (vehicle) -> "Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel();
    // TODO
    // Here you want to collect them all into a Map.
    // To use the function vehicleToMakeModel defined above, use vehicleToMakeModel.apply(vehicle);
    return null;
  }

  public static Set<String> findMakes(List<Vehicle> vehicles) {
    // TODO
    // Hint: you will need the Stream.map function
    return null;
  }

  public static List<Vehicle> vehiclesWithMoreThan3Wheels(List<Vehicle> vehicles) {
    // TODO
    // Hint : here you want to apply a filter on the given list of vehicles
    return null;
  }

  public static boolean hasAnyCar(Stream<Vehicle> vehicles) {
    // TODO
    // Hint : try to find if any vehicle in the stream match the predicate "is this vehicle a Car ?"
    return false;
  }

  public static boolean areAllCars(Stream<Vehicle> vehicles) {
    // TODO
    // Hint : try to find if all vehicle in the stream match the predicate "is this vehicle a Car ?"
    return false;
  }

  public static int findMaxWeight(List<Vehicle> vehicles) {
    // TODO
    // Hint : there is a max function on a Stream.
    // of course you will need what you learned while writing the above functions
    return 0;
  }

  public static int findMinNbOfWheels(List<Vehicle> vehicles) {
    // TODO
    // Hint : there is a min function on a Stream.
    // of course you will need what you learned while writing the above functions
    return 0;
  }

  public static long countVehicles(Floor floor) {
    // TODO : no hint this time
    return 0;
  }

  public static long countVehicles(Parking parking) {
    // TODO : no hint this time
    return 0;
  }

  public static Floor findLeastOccupiedFloor(Parking parking) {
    // TODO
    // Hint : you'll need to use the reduce function
    return null;
  }

  public static Set<String> findMakes(Parking parking) {
    // TODO
    // Hint : you will need a new function : Stream.flatMap
    return null;
  }

  public static String listMakes(Parking parking) {
    // TODO
    // Hint : use collect with the proper collector from Collectors
    // Desired result: for a Parking with cars of makes A and B, the string "A\nB"
    return null;
  }

  public static String listMakesWithReduce(Parking parking) {
    // TODO
    // Hint : use a reduce function this time
    // Desired result: for a Parking with cars of makes A and B, the string "A\nB"
    return null;
  }

  public static Optional<Truck> findAnyTruck(Stream<Vehicle> vehicles) {
    // TODO
    return Optional.empty();
  }

  public static <T> ArrayList<T> collectToListWithReduce(Stream<T> stream) {
    // TODO
    return null;
  }

  public static List<Vehicle> listVehicles(Parking parking) {
    // TODO
    return null;
  }

  public static List<Vehicle> listVehiclesDebug(Parking parking) {
    // TODO : same method as above but logging what each step do.
    // For example if you do stream.map.filter, you must log in the console map(...) and then filter(...). This,
    // without logging everything at the end of the method.
    // Hint : take a look at the documentation of Stream
    return null;
  }

  public static void printVehicles(Parking parking) {
    Function<Vehicle, String> toStringVehicle = (vehicle) -> "Found a " + vehicle.getColor() + " " +
      vehicle.getMake() + " " + vehicle.getModel() + " with " + vehicle.getNbWheels() + " wheels that weights " +
      vehicle.getWeight() + "kg.";

    // TODO : for each vehicle, display the result of the above function into the stdout (standard output)
  }

  public static Stream<Vehicle> sortByMake(Stream<Vehicle> vehicles) {
    // TODO
    return null;
  }
}
