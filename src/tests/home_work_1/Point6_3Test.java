package src.tests.home_work_1;

import src.home_work_1.Point6_3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point6_3Test {
    Point6_3 welcome2 = new Point6_3();

    @Test
    public void vasyaCase() {
        String actual = welcome2.welcome("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", actual);
    }

    @Test
    public void anastasiaCase() {
        String actual = welcome2.welcome("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", actual);
    }

    @Test
    public void aViKtoCase() {
        String actual = welcome2.welcome(":Жмых");
        Assertions.assertEquals("Добрый день, а вы кто?", actual);
    }

    @Test
    public void nullName() {
        String actual = welcome2.welcome(null);
        Assertions.assertEquals("Похоже что это не имя", actual);
    }

    @Test
    public void nameWithDifferentCharacters() {
        String actual = welcome2.welcome("kro##t");
        Assertions.assertEquals("Похоже что это не имя", actual);
    }

    @Test
    public void nameWithSpacesIside() {
        String actual = welcome2.welcome("Л Ю Б А");
        Assertions.assertEquals("Добрый день, а вы кто?", actual);
    }

    @Test
    public void nameOnDifferentLanguage() {
        String actual = welcome2.welcome("Joséphine");
        Assertions.assertEquals("Добрый день, а вы кто?", actual);
    }
}
