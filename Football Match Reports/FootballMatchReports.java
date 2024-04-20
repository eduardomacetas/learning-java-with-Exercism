// Exercise: https://exercism.org/tracks/java/exercises/cars-assemble
// Description: This learning exercise helped evolve your knowledge of Switch Statements.

// You've unlocked 1 concept: Exceptions


public class FootballMatchReports {    
  public static String onField(int shirtNum) {
      switch (shirtNum) {
          case 1:
              return "goalie";
          case 2:
              return "left back";
          case 3:
          case 4:
              return "center back";
          case 5:
              return "right back";
          case 6:
          case 7:
          case 8:
              return "midfielder";
          case 9:
              return "left wing";
          case 10:
              return "striker";
          case 11:
              return "right wing";
          default:
              throw new IllegalArgumentException();
      }

      //  return switch (shirtNum) {
      //     case 1 -> "goalie";
      //     case 2 -> "left back";
      //     case 3, 4 -> "center back";
      //     case 5 -> "right back";
      //     case 6, 7, 8 -> "midfielder";
      //     case 9 -> "left wing";
      //     case 10 -> "striker";
      //     case 11 -> "right wing";
      //     default -> throw new IllegalArgumentException();
      // };
  }
}
