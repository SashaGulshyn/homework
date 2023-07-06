package src.home_work_6.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.home_work_6.*;

public class ISearchEngineTest {

    @Test
    public void positiveCheckForWordWar() {       //позитивная проверка для "война"
        EasySearch search = new EasySearch();
        String text = "война? Да пошла бы она нахер эта война";
        String word = "война";
        long expectedCount = 2;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void positiveCheckForWordI() {       //позитивная проверка для "и"
        EasySearch search = new EasySearch();
        String text = " и и иии иду в магазин";
        String word = "и";
        long expectedCount = 2;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void positiveCheckForWordPeace() {       //позитивная проверка для "мир"
        EasySearch search = new EasySearch();
        String text = "мир - это то, чего нам отчаянно не хватает в последнее время. Вот бы все помирились и жили дружно";
        String word = "мир";
        long expectedCount = 1;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkForExactMatch() {       //хочу проверить, что найдётся лишь только слово "война" (а не любые от него производные)
        EasySearch search = new EasySearch();
        String text = "мировые войны воюют военщину";
        String word = "война";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkMirWithElements() {     //проверка на вычленение слова, если с ним "склеены" знаки (препинания и пр.)
        EasySearch search = new EasySearch();
        String text = "??? мир! -- хрупкая вещь";
        String word = "мир";
        long expectedCount = 1;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkSpaceSymbol() {          //проверяю, что находим только слово "мир", и пробелы не караптают результат при этом
        EasySearch search = new EasySearch();
        String text = "м ир м и ир";
        String word = "мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void differentMSymbol() {         //слово "мир" содержит букву m из латинского алфавита
        EasySearch search = new EasySearch();
        String text = "mир";
        String word = "мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkRegister() {                //проверяю как обрабатывается "И" в верхнем регистре
        EasySearch search = new EasySearch();
        String text = "Ииии тут он налил воды,и съел хлеба, ИИИ заикнулся об и)";
        String word = "и";
        long expectedCount = 2;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void frazeAsAWhole() {           //проверяю как обработается словосочетание целиком (а не одно слово)
        EasySearch search = new EasySearch();
        String text = "война и мир";
        String word = "война и мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkBottomUp() {          //проверка на обработку слова задом наперёд
        EasySearch search = new EasySearch();
        String text = "война и рим";
        String word = "мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void differentLinesCheck() {         //проверка с переносом букв слова в другую строку
        EasySearch search = new EasySearch();
        String text = "М\n и р\n";
        String word = "мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    //Тесты для RegExSearch
    @Test
    public void positiveCheckForRegExSearch() {
        RegExSearch searchReg = new RegExSearch();
        String text = "The dog plays in the yard";
        String word = "dog";
        long expectedCount = 1;
        long actualCount = searchReg.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void negativeCheckForRegExSearch() {
        RegExSearch searchReg = new RegExSearch();
        String text = "dog is on the backyard";
        String word = "dog";
        long expectedCount = 1;
        long actualCount = searchReg.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    //Тесты для SearchEnginePunctuationNormalizer

    @Test
    public void positiveCheckPunctuationNormalizer() {
        ISearchEngine mockSearchEngine = new MockSearchEngine();
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(mockSearchEngine);
        String text = "Проверим, как можно,, удалить знаки? пунктуации из     этого текста!";
        String word = "Проверим как можно удалить знаки пунктуации из этого текста";
        String expectedNormalizedText = "Проверим как можно удалить знаки пунктуации из этого текста";
        long expectedSearchResult = 1;
        long actualSearchResult = searchEngine.search(text, word);
        Assertions.assertEquals(expectedNormalizedText, ((MockSearchEngine) mockSearchEngine).getLastSearchedText());
        Assertions.assertEquals(expectedSearchResult, actualSearchResult);
    }

    private class MockSearchEngine implements ISearchEngine {
        private String lastSearchedText;

        public String getLastSearchedText() {
            return lastSearchedText;
        }

        @Override
        public long search(String text, String word) {
            lastSearchedText = text;
            return 1;
        }
    }
}

 //   @Test

 //   public void positiveCheckForWithoutRegister(){
 //       ICaseSensitiveSearch searchEngine = new WithoutRegister(new CaseSensitiveSearch());
 //       String text = "Проверка на Кейс сенситив";
 //       String keyword = "кейс";
 //       boolean found = searchEngine.search(text, keyword);
 //       Assertions.assertTrue(found);
 //   }
//
 //   public static class CaseSensitiveSearch implements ICaseSensitiveSearch {
 //       @Override
 //       public boolean search(String text, String keyword) {
 //           return text.contains(keyword);
 //       }
//}
