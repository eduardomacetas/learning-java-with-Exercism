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
