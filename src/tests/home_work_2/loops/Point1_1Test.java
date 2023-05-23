package src.tests.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.loops.Point1_1;
import org.junit.jupiter.api.Test;
import src.home_work_2.loops.Point1_1Main;

public class Point1_1Test {

    @Test
    public void positiveNumberCheck (){
        String actual = Point1_1.loopsTest(String.valueOf(3),3);
        Assertions.assertEquals(String.valueOf(6),actual);
    }
    @Test
    public void userEnteredNegativeNumber (){
        String actual = Point1_1.loopsTest(String.valueOf(-2),3);
        Assertions.assertEquals(String.valueOf(-6),actual);
    }

    @Test
  public void userEnteredNumberGreaterThan21 () {
      String actual = Point1_1.loopsTest(String.valueOf(22),22);
      String expected = 22 + " - Значение получено в результате переполнения и может быть отличным от ожидаемого!" + "Задайте положительное число до 20ти включительно.";
      Assertions.assertEquals(expected,actual);
  }
}
