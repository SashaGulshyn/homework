package src.home_work_5;

import java.util.*;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавления данных
     * @param item элемент к добавлению
     * @return -1 = данный элемент нельзя вставлять/ return i - номер позиции, куда вставлен элемент / return overFlow
     * - в случае переполнения
     */
    public int add(T item) {
        if (item == null)
            return -1;

//        T[] nextArray = data;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return overFlow(item);
    }

    /**
     * Метод для создания нового массива (с переносом старого + 1) в случае переполнения
     * @param item данные к добавлению
     * @return возвращает номер позиции, в которую были положены данные
     */
    public int overFlow(T item) {
        T[] newArray = Arrays.copyOf(data, data.length + 1);
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
        return newArray.length;
    }

    /**
     * Метод для получения предварительно сохранённого объекта, переданного через int add
     * @param index обращается к элементу массива
     * @return возвращает объект
     */
    public T get(int index) {
        if (!(index >= 0)) {
            return null;
        }
        return data[index];
    }

    /**
     * Метод возвращает массив из поля data
     * @return возвращает массив данных
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод для удаления индекса элемента из поля data по индексу
     * @param index индекс элемента, который нужно удалить
     * @return false значение, если нет такого индекса / true - если получилось вызвать удаление + переложить данные
     */
    public boolean delete(int index) {
        if (!(index >= 0)) {
            return false;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOfRange(data, 0, data.length - 1);
        return true;
    }

    /**
     * Метод удаления элемента из поля data
     * @param item - элемент, который нужно удалить
     * @return delete - удаляет элемент, если таковой был найден в массиве. Return false - если элемент null
     * return true, если удаление успешно
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i],item)) {
                List<Object> dataList = new ArrayList<>(Arrays.asList(data));
                dataList.remove(i);
                data = (T[]) dataList.toArray();
                return true;
            }
        }
        return false;
    }

//    @Override
//    public String toString() {
//        return "data=" + Arrays.toString(data);
//    }

    /*
    public static void main(String[] args) {
        Integer[] dataArr = new Integer[5];
        dataArr[0] =1;
        DataContainer<Integer> integerDataContainer;
        integerDataContainer = new DataContainer<Integer>(dataArr);

        DataContainer<Object> container2 = new DataContainer<>();
        int index1 = container2.add("Привет");
        int index2 = container2.add("Как дела");
        int index3 = container2.add("Работаю");
        int index4 = container2.add("Давай потом");
        int index5 = container2.add(777);
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        container2.delete(text1);
        System.out.println(container.get(index1));
    }

     */
}


//    public static void main(String[] args) {
//        Integer [] array = new Integer[10];  // попробовать с нулевым значение для массива
//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите целое число, которое будет следующим добавлено в массив");
//        Integer nextInt = console.nextInt();
//        System.out.println(methodIntAdd.add(array,nextInt));
//    }
//}


//      }
//        if data.lenght = max
//      if (Arrays.asList(data).contains(null))
//          Array.setInt(start,0,nextInt) ;
//      for (int s : start)
//        for (int i = 0; i <= data.length;) {
//          int[] newData = new int[data.length + 1];
//      }
//      for (int i = 0; i < data.length; i++) {
//          newData [i] = data[i];
//      }
