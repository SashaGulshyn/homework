package src.tests.home_work_1;

import src.home_work_1.Point6_1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point6_1Test {
    Point6_1 welcome = new Point6_1();

    @Test
    public void vasyaCase (){
        String actual = welcome.welcome("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал ", actual);
    }

    @Test
    public void anastasiaCase (){
        String actual = welcome.welcome("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", actual);
    }

    @Test
    public void aViKtoCase (){
        String actual = welcome.welcome("Петрович");
        Assertions.assertEquals("Добрый день, а вы кто?", actual);
    }

    @Test
    public void charactersDoesntAllowed (){
        String actual = welcome.welcome("66123$");
        Assertions.assertEquals("Похоже что это не имя", actual);
    }
}
