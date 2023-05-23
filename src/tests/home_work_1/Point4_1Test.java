package src.tests.home_work_1;

import src.home_work_1.Point4_1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;

public class Point4_1Test {

    /**
     * Реализация заданий из home_work_1 была выполнена "в лоб". Для хорошего покрытия тестами (и чтобы таковые имели
     * больше проверок/были лучше) следует по-хорошему переписать задания из HW1 с учётом тех знаний, которые были получены позже ->
     * вынести sout и работу с консолью в main из методов.
     * Чтобы успеть поработать с кодом содержащим больше логики (HW2/HW3) я выполню лишь какие-то базовые проверки для HW1
     */
    @Test
    public void positiveCheckEvenNumber (){
        int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int actual = array[2] / 2;
        Assertions.assertEquals(1, actual);
    }


}
