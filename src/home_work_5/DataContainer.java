package src.home_work_5;

import java.util.*;

import src.home_work_5.IntegerDataComparator;
import src.home_work_5.DataContainerMain;
import static java.util.Collections.swap;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавления данных
     *
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
     *
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
     *
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
     *
     * @return возвращает массив данных
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод для удаления индекса элемента из поля data по индексу
     *
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
     *
     * @param item - элемент, который нужно удалить
     * @return delete - удаляет элемент, если таковой был найден в массиве. Return false - если элемент null
     * return true, если удаление успешно
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                List<Object> dataList = new ArrayList<>(Arrays.asList(data));
                dataList.remove(i);
                data = (T[]) dataList.toArray();
                return true;
            }
        }
        return false;
    }

    /**
     * Метод для переборки каждого значения массива начиная с конца. При сравнении элементов массива данные записываются
     * в темповую переменную, чтобы после поменять элементы местами
     *
     * @param comparator вызывает компаратор, сравнивающий значения o1 и o2
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
//                if (data[j] == null) {
//                    for (int k = 0; k < data.length; k++) {
//                        data[j] = data[k];//                   }
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    /**
     * Метод переопределяющий toString, с приведением массива к String и перебором null'овых значений, которые не возвращаются
     *
     * @return отдаёт приведённый к String'у массив
     */
    @Override
    public String toString() {
        T[] array = Arrays.copyOf(data, data.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array = Arrays.copyOfRange(array, 0, array.length - 1);
            }
        }
            return Arrays.toString(array);
        }
}