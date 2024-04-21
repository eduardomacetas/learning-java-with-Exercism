// Exercise: https://exercism.org/tracks/java/exercises/two-fer

public class Twofer {
  public String twofer(String name) {
      return name != null ? "One for " + name + ", one for me." : "One for you, one for me.";
  }
}
