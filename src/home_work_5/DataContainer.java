package src.home_work_5;

import java.util.*;

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
        if (data == null) {
            data = (T[]) new Object[1];
            data[0] = item;
        } else {
            T[] newData = (T[]) new Object[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            newData[data.length] = item;
            data = newData;
        }
        return data.length;
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
        if (index >= data.length) {
            return false;
        }
        if (data.length == 1) {
            data = null;
            return true;
        }
        T[] newData = (T[]) new Object[data.length - 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                newData[j] = data[i];
                j++;
            }
        }
        data = newData;
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
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        T[] newData = (T[]) new Object[data.length - 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                newData[j] = data[i];
                j++;
            }
        }
        data = newData;
        return true;
    }

    /**
     * Сортировка по длине для String
     */
    public void sort(Comparator comparator) {
        T[] arr = this.data;
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        this.data = arr;
    }

    /**
     * Сортировка по алфавиту
     */

    public void sortAlphabet(Comparator comparator) {
        String[] arr = (String[]) this.data;
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        this.data = (T[]) arr;
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