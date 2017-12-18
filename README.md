# Java Exercises

To learn the Java language, only for french speaking people, I recommend you go to [OpenClassrooms](https://openclassrooms.com/courses/apprenez-a-programmer-en-java).

As an IDE, I recommend [IntelliJ Community](https://www.jetbrains.com/idea/download/#section=mac)

The exercises will be built-on the result of the previous exercises.
If you get blocked, you can open an issue.

I can review your code if you want. For it, simply make a pull-request on this project.
If you are not familiar with git, you can learn the basis of it [here](https://try.github.io/levels/1/challenges/1)

In order to run your code, you can either use or IDE or type gradle by typing this line in your terminal :
`./gradlew run`. 

## First exercise

You will build a parking of vehicles. The properties of your parking will be :

- A parking contains a maximum of 10 vehicles
- It is possible to park or remove a vehicle from the parking
- A vehicle has, at least, a make, a model, a color, a weight and a number of wheels.
- A parking can tell how many vehicles are parked-in, how many slots are available
 and the sum of the weight of the vehicle parked-in it.

Hint : you will need to be familiar with the notions of : variables - conditions - loops -
 arrays - class

## Second exercise

- A parking can now contain a maximum of N vehicles, N being passed as an
 argument of the constructor of Parking.
 - A vehicle can be either a Car, a Motorcycle or a Truck
 - It is impossible to create a new Vehicle. So, writing `new Vehicle(...)` must not compile.
 - The list of vehicle in the parking must be of type List<Vehicle>

 Hint : you will need to be familiar with the notions of : heritage - abstract classes - collections of objects

 ## Third exercise

 - Now the constructor of all your classes must be private. Implement the Factory pattern.

 ## Fourth exercise

 - Make use of the stream from Java 8 for all the Collections types used across the app.

 Hint : search for tutorials about Java 8 streams

 ## Fifth exercise

 - The parking now has N floor and M aisles per floor. Each aisles contains K parking slots.
 - Every floor contains the same amount of aisles and every aisles contains the same amount of parking slots.
 - A parking slot can be a ParkingSlot of any subclass of Vehicle. So a parking slot can welcome a Car OR a Motorcycle
 OR a Truck
 - An aisle is identified by a letter of your choice in a floor.
 - A floor is identified by a number in the parking.
 - A parking slot has 2 states : free or occupied.
 - A parking slot has a vehicle parked on it, or not. Of course the vehicle is of the same type as the
  parking slot can store.
 - The parking must be able to give the amount of slots that are available/occupied
  per floor, per aisle and in the whole parking.

  Hint : take a look at the Optional class in Java. You will also need to be
   familiar with the notion of generic classes.

  ## Sixth exercise

  - A Garage can make a few transformations on a car : changing its color, fixing it
   (which means that the car can now be broken ;) ) and any other transformation you think about.
  - All objects across the app are still immutable (except the builders).

  ## Seventh exercise

  - Replace your huge Main with unit tests

  Hint : you will need JUnit

  ## Eight exercise

  - Connect your app to the database of your choice
