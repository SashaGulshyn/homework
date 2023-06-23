package src.home_work_6.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.home_work_6.EasySearch;

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
    public void differentLinesCheck(){         //проверка с переносом букв слова в другую строку
        EasySearch search = new EasySearch();
        String text = "М\n и р\n";
        String word = "мир";
        long expectedCount = 0;
        long actualCount = search.search(text, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
