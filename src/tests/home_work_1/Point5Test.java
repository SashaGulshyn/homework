package src.tests.home_work_1;

import src.home_work_1.Point5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Point5Test {

    @Test
    public void vacationTrue() {
        boolean result = Point5.sleepIn(false, true);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void vacationFalse() {
        boolean result = Point5.sleepIn(true, false);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void weekendDay() {
        boolean result = Point5.sleepIn(false, false);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void vacationDuringWorkingDays() {
        boolean result = Point5.sleepIn(true, true);
        Assertions.assertEquals(true, result);
    }

//    @Test
//    public void workingDayFromMondayTillFriday() {
//        int result = Point5.sleepIn();
//    }

}
