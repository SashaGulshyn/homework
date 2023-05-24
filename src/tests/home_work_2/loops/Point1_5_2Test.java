package src.tests.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.loops.Point1_5_2;
import org.junit.jupiter.api.Test;

public class Point1_5_2Test {

    @Test
    public void evenCheck (){
        String actual = Point1_5_2.evenOdd(124124666);
        Assertions.assertEquals(7 + " чётных " + 2 + " нечётных ",actual);
    }

    @Test
    public void negativeEvenCheck (){
        String actual = Point1_5_2.evenOdd(-215997);
        Assertions.assertEquals("1 чётных 5 нечётных",actual);
    }

    @Test
    public void fibonacciCheckWithPositive (){
        String actual = String.valueOf(Point1_5_2.fibonacci(8));
        Assertions.assertEquals("1, 2, 3, 5, 8, 13, 21, 34", actual);
    }

    @Test
    public void fibonacciWithNegative (){
        String actual = String.valueOf(Point1_5_2.fibonacci(-2));
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void stepCheckPositive (){
        String actual = String.valueOf(Point1_5_2.step(12));
        Assertions.assertEquals("6 18 30 42 54 66 78 90",actual);
    }

    @Test
    public void differentRange (){
        String actual = String.valueOf(Point1_5_2.step(34));
        Assertions.assertEquals("6 18 30 42 54 66 78 90",actual);
    }

    @Test
    public void roundNumber () {
        String actual = String.valueOf(Point1_5_2.round(98612451));
        Assertions.assertEquals("15421689",actual);
    }
}
