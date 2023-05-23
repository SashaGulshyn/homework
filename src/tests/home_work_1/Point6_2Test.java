package src.tests.home_work_1;

import src.home_work_1.Point6_2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point6_2Test {
    Point6_2 welcome2 = new Point6_2();

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
        String actual = welcome2.welcome("Петрович");
        Assertions.assertEquals("Добрый день, а вы кто?", actual);
    }

    @Test
    public void emptyName() {
        String actual = welcome2.welcome(" ");
        Assertions.assertEquals("Похоже что это не имя", actual);
    }

    @Test
    public void nameWithDifferentCharacters() {
        String actual = welcome2.welcome("$trin5");
        Assertions.assertEquals("Похоже что это не имя", actual);
    }
}
