package src.home_work_6;

import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String normalizedText = normalizeText(text);
        return searchEngine.search(normalizedText, word);
    }

    /**
     * punct - для удаления знаков препинания/s+ - для удаления лишних пробелов/ n - удаление отступов
     */
    private String normalizeText(String text) {
        String normalizedText = text.replaceAll("\\p{Punct}", "");
        normalizedText = normalizedText.trim().replaceAll("\\s+", " ");
        normalizedText = normalizedText.replaceAll("\\n", "");

        return normalizedText;
    }
}
