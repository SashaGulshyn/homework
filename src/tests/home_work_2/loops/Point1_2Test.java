package src.tests.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.loops.Point1_2;
import org.junit.jupiter.api.Test;

public class Point1_2Test {
    Point1_2 numbers = new Point1_2();

    @Test
    public void enteredWholeNumber() {
        String actual = Point1_2.multiplayer(String.valueOf(23));
        Assertions.assertEquals(String.valueOf("6"), actual);
    }
    @Test
    public void enteredAlphabetic (){
        String actual = Point1_2.multiplayer("Twenty");
        Assertions.assertEquals("Введено не число", actual);
    }

    @Test
    public void enteredDouble () {
        String actual = Point1_2.multiplayer("0.3");
        Assertions.assertEquals("Введено не целое число",actual);
    }

    @Test
    public void enteredSymbols (){
        String actual = Point1_2.multiplayer("$$$");
        Assertions.assertEquals("Введено не число", actual);
    }
}

