package src.home_work_5;

import src.home_work_5.DataContainer;
import src.home_work_5.IntegerDataComparator;
import src.home_work_5.StringDataComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataArr = new Integer[10];
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);

        String[] stringArr = new String[5];
        DataContainer<String> stringDataContainer;
        stringDataContainer = new DataContainer<String>(stringArr);

        int index1 = stringDataContainer.add("Привет");
        int index2 = stringDataContainer.add("Как дела");
        int index3 = stringDataContainer.add("Работаю");
        int index4 = stringDataContainer.add("Давай потом");
        int index5 = integerDataContainer.add(777);
        String text1 = stringDataContainer.get(index1);
        String text2 = stringDataContainer.get(index2);
        String text3 = stringDataContainer.get(index3);
        String text4 = stringDataContainer.get(index4);
        Integer ind = integerDataContainer.get(index5);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println(ind);
        integerDataContainer.delete(index5);
        System.out.println(stringDataContainer.get(index1));

        /**
         * я так и не понял, каким образом можно привести массив свободный от null'ов к .sort. Метод сортировки работает
         * с data массивом, в котором эти самые null всё ещё есть, а как вызвать не системный Arrays.toString, а мой
         * toString метод из override непонятно. Видимо как-то нужно было делать через super...
         */

//      stringArr = new String[]{stringDataContainer.toString()};
//      stringDataContainer.sort(new StringDataComparator()); //Сортируется по длине
//      System.out.println(Arrays.toString(stringArr)); // ["Привет", "Работаю", "Как дела", "Давай потом"]
//      stringDataContainer.sort(new StringDataComparator()); //Сортируется по алфавиту
//      System.out.println(Arrays.toString(stringArr)); // ["Давай потом", "Как дела", "Привет", "Работаю"]
    }
}
