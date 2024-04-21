// Exercise: https://exercism.org/tracks/java/exercises/cars-assemble
// Description: This learning exercise helped evolve your knowledge of If-Else Statements and Numbers.

// You've unlocked 11 concepts: Ternary Operators
//                              Classes
//                              Arrays
//                              For-Each Loops
//                              For Loops
//                              Exceptions
//                              Nullability
//                              Inheritance
//                              Randomness
//                              Date-Time
//                              Bit Manipulation

public class CarsAssemble {
    
    Double carsProducedPerHour = 221.0;
    
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
          return speed * carsProducedPerHour;
        } else if (speed >= 5 && speed <= 8 ) {
          return speed * (carsProducedPerHour * 0.9);
        } else if (speed == 9) {
          return speed * (carsProducedPerHour * 0.8);
        } else {
          return speed * (carsProducedPerHour * 0.77);
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
