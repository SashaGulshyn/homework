package src.tests.home_work_1;

import src.home_work_1.Point4_3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point4_3Test {
    @Test
    public void divideNumberPositiveCheck (){
        int actual = 6 % 3;
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void zeroReturnsError (){
        int actual = 0 % 0;
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void negativeNumberError () {
        int actual =  - 5 % 2;
        Assertions.assertEquals(-1.6, actual);
    }
}
