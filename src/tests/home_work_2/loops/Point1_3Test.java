package src.tests.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import src.home_work_2.loops.Point1_3;
import org.junit.jupiter.api.Test;

public class Point1_3Test {
        Point1_3 numbers = new Point1_3();

        @Test
        public void enteredWholeNumber() {
            String actual = Point1_3.degree(String.valueOf(3), 3);
            Assertions.assertEquals("Введено не дробное число! Используйте . для разделения!", actual);
        }

        @Test
        public void enteredAlphabetic() {
            String actual = Point1_3.degree("letstest", 2);
            Assertions.assertEquals("Введено не число", actual);
        }

        @Test
        public void enteredDouble() {
            String actual = Point1_3.degree(String.valueOf(2.5),3);
            Assertions.assertEquals("2.5 ^ 3 = 15.625", actual);
        }

        @Test
        public void enteredWrongDegree() {
            String actual = Point1_3.degree("$$$",4);
            Assertions.assertEquals("Введено не число", actual);
        }

        @Test
        public void enteredDoubleWithMinus (){
            String actual = Point1_3.degree("-2.5",3);
            Assertions.assertEquals("-2.5 ^ 3 = -15.625",actual);
        }
    }

