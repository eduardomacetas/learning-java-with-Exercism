// Exercise: https://exercism.org/tracks/java/exercises/karls-languages
// Description: This learning exercise helped evolve your knowledge of Lists and Generic Types.

// You've unlocked 3 concepts: Interfaces
//                             Sets

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return containsLanguage("Java") || containsLanguage("Kotlin");
    }
}
