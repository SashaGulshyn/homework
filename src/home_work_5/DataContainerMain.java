package src.home_work_5;

import src.home_work_5.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataArr = new Integer[10];
//      dataArr[0] = 1;
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);

        String[] stringArr = new String[10];
        stringArr[0] = "First";
        DataContainer<String> stringDataContainer;
        stringDataContainer = new DataContainer<String>(stringArr);

//      DataContainer<Object> container2 = new DataContainer<>();
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
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(ind);
        integerDataContainer.delete(index5);
        System.out.println(stringDataContainer.get(index1));
    }
}
