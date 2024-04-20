// Exercise: https://exercism.org/tracks/java/exercises/log-levels
// Description: This learning exercise helped evolve your knowledge of Strings.

// You've unlocked 9 concepts: Chars
//                             Classes
//                             Interfaces
//                             Inheritance
//                             Lists
//                             Generic Types
//                             Nullability
//                             Randomness
//                             Date-Time

public class LogLevels {
    
    public static String message(String logLine) {
        if (logLine.contains("ERROR")) {
            return logLine.replace("[ERROR]:", "").trim();
        } else if (logLine.contains("WARNING")) {
            return logLine.replace("[WARNING]:", "").trim();
        } else if (logLine.contains("INFO")) {
            return logLine.replace("[INFO]:", "").trim();
        } else {
            return "";
        }
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return "error";
        } else if (logLine.contains("WARNING")) {
            return "warning";
        } else if (logLine.contains("INFO")) {
            return "info";
        } else {
            return "";
        }
    }

    public static String reformat(String logLine) {
        if (logLine.contains("ERROR")) {
            return message(logLine) + " (error)";
        } else if (logLine.contains("WARNING")) {
            return message(logLine) + " (warning)";
        } else if (logLine.contains("INFO")) {
            return  message(logLine) + " (info)";
        } else {
            return "";
        }
    }
}
