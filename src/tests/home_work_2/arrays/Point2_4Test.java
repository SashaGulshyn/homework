package src.tests.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.arrays.Point2_4;
import org.junit.jupiter.api.Test;
import src.home_work_2.utils.ArraysUtils;

public class Point2_4Test {

    @Test
    public void summCorrectCheck (){
        int[] container = {23,424,512};
        int actual = Point2_4.natural(container);
        Assertions.assertEquals(959,actual);
    }

    @Test
    public void summWithNegative () {
        int[] container = {-5,42,351};
        int actual = Point2_4.natural(container);
        Assertions.assertEquals(388,actual);
    }

    @Test
    public void maxValue (){
        int[] container = {11,41,231,1031};
        int actual = Point2_4.index(container);
        Assertions.assertEquals(1031,actual);
    }

    @Test
    public void averageCheck (){
        int[] container = {10,22,1};
        double actual = Point2_4.average(container);
        Assertions.assertEquals(11,actual);
    }

    @Test
    public void minimunCheck (){
        int[] container = {10,22,1,1245,12};
        int actual = Point2_4.minimum(container);
        Assertions.assertEquals(1,actual);
    }

    @Test
    public void summaCheck (){
        int[] container = {325,91,2};
        int actual = Point2_4.minimum(container);
        Assertions.assertEquals(22,actual);
    }
}
