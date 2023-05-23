package src.tests.home_work_1;

import src.home_work_1.Point4_2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point4_2Test {

    @Test
    public void averagePositiveTest (){
        int expected = 5;
        int actual = (8 + 3 + 4) / 3;
        Assertions.assertEquals(expected, actual);
    }
}
