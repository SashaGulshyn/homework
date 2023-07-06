package src.home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// При использовании паттерна UNICODE_CASE нужное слово всё равно не находится. Я пытался ввернуть (?u) в regex, но он
// всё равно не отрабатывал

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}

