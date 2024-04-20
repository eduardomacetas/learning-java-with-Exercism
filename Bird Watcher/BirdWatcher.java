// Exercise: https://exercism.org/tracks/java/exercises/bird-watcher
// Description: This learning exercise helped evolve your knowledge of Arrays,
//              For-Each Loops, and For Loops.

// You've unlocked 3 concepts: Lists
//                             Generic Types
//                             Randomness

class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
      this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
      return birdsPerDay;
  }

  public int getToday() {
      return birdsPerDay[getLastWeek().length - 1];
  }

  public void incrementTodaysCount() {
      birdsPerDay[birdsPerDay.length - 1]++;
  }

  public boolean hasDayWithoutBirds() {
      for(int element : getLastWeek()) {
          return element == 0 ? true : false;
      }
      return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
      numberOfDays = Math.min(numberOfDays, birdsPerDay.length);
      int birdNumber = 0;
      for (int i=0; i<numberOfDays; i++) {
          birdNumber += birdsPerDay[i];
      }
      return birdNumber;
  }

  public int getBusyDays() {
      int busyDays = 0;
      for (int i=0; i<7;i++) {
          if (birdsPerDay[i] >= 5) {
              busyDays += 1;
          }
      }
      return busyDays;
  }
}
