package src.tests.home_work_1;

import src.home_work_1.Point4_4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point4_4Test {

    @Test
    public void bytePositiveCheck(){
        double actual = Math.pow(2.0,10);
        Assertions.assertEquals(1024,actual);
    }

    @Test
    public void negativeNumberWorksFine(){
        double actual = Math.pow(-7.0,3);
        Assertions.assertEquals(-343,actual);
    }
}
