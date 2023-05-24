package src.tests.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.loops.Point1_5;
import org.junit.jupiter.api.Test;

public class Point1_5Test {

    @Test
    public void numbersAreNatural () {
        String actual = String.valueOf(Point1_5.maxFromUser(912412));
        Assertions.assertEquals("9",actual);
    }

    @Test
    public void negativeNumber () {
        String actual = String.valueOf(Point1_5.maxFromUser(-3334));
        Assertions.assertEquals(4,actual);
    }

    @Test
    public void sameNumbers (){
        Long actual = Point1_5.maxFromUser(00000);
        Assertions.assertEquals(0,actual);
    }

   //@Test
   //public void enteredAlphabetic () {
   //    String actual = Point1_5.maxFromUser("1Kurwa");
   //    Assertions.assertEquals("error", actual);
   //}
}
