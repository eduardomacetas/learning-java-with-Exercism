// Exercise: https://exercism.org/tracks/java/exercises/lasagna
// Description: This learning exercise helped evolve your knowledge of Basics.

// You've unlocked 2 concepts: Booleans
//                             Strings

public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int expectedMinutesInOven ) {
        return expectedMinutesInOven() - expectedMinutesInOven;
    }

    public int preparationTimeInMinutes(int layersNumber) {
        return 2 * layersNumber;
    }

    public int totalTimeInMinutes(int layersNumber, int minutesInOven) {
        return preparationTimeInMinutes(layersNumber) + minutesInOven;
    }
}
