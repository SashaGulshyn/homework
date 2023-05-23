package src.tests.home_work_1;

import src.home_work_1.Point4_6;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point4_6Test {

    @Test
    public void YearTest (){
        int actual = 2023 % 4;
        Assertions.assertEquals(3,actual);
    }
}
