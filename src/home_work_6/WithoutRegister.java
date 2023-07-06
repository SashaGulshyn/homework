package src.home_work_6;

public class WithoutRegister implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public WithoutRegister(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String keyword) {
        // Проверка search engine на case-sensitive
        if (searchEngine instanceof ICaseSensitiveSearch) {
            // Конвертация в lowercase
            text = text.toLowerCase();
            keyword = keyword.toLowerCase();
        }

        // Поиск используя нужный engine
        return searchEngine.search(text, keyword);
    }
}
