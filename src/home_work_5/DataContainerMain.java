package src.home_work_5;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataArr = new Integer[10];
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);

        String[] stringArr = new String[4];
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

      stringDataContainer.sort(new StringDataComparator()); //Сортируется по длине
        System.out.println(stringDataContainer);

      stringDataContainer.sortAlphabet(new StringDataComparator()); //Сортируется по алфавиту
      System.out.println(stringDataContainer); // ["Давай потом", "Как дела", "Привет", "Работаю"]
    }
}
