package src.home_work_2.arrays;

import src.home_work_2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        all(container);
        secondElement(container);
        cyclereturn(container);
    }

    /**
     * Метод all для вывода всех элементов массива с помощью циклов for, foreach, do...while, while
     * @param array забирает метод из ArraysUtils.arrayFromConsole() для наполнения массива
     */
    public static void all(int[] array) {
        int[] container = array;
        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.println(" - все элементы массива с помощью цикла for");

        for (int element : container) {
            System.out.print(element + " ");
        }
        System.out.println(" - все элементы массива с помощью цикла foreach");

        int count = 0;
        do {
            int element = container[count];
            System.out.print(element + " ");
            count++;
        }
        while (count < container.length);
        System.out.println(" - все элементы массива с помощью цикла do while");

        int count2 = 0;
        while (count2 < container.length) {
            int element = container[count2];
            System.out.print(element + " ");
            count2++;
        }
        System.out.println(" - все элементы массива с помощью цикла while");
        System.out.println();
    }

    /**
     * Метод проверяет размер массива. Меньше двух элементов - пропускает подсчёт циклами. Более двух - применяет for, do...while,while. Foreach обыграть не вышло =/
     * @param array как и ранее забирает метод из ArraysUtils.arrayFromConsole() для наполнения массива
     */
    public static void secondElement(int[] array) {
        int[] container = array;
        if (container.length <= 1) {
            System.out.println("Длинна массива меньше двух - второй элемент не может быть отображен!");
        } else {
            for (int i = 1; i < container.length; i += container.length) {
                int element = container[i];
                System.out.print(element + " ");
            }
            System.out.println(" - второй элемент массива при помощи for");


            int count = 1;
            do {
                int element = container[count];
                System.out.print(element + " ");
                count += container.length;
            }
            while (count < container.length);
            System.out.println(" - второй элемент массива при помощи do while");

            int count2 = 1;
            while (count2 < container.length) {
                int element = container[count2];
                System.out.print(element + " ");
                count2 += container.length;
            }
            System.out.println(" - второй элемент массива при помощи while");
            System.out.println();
        }
    }

    /**
     * Метод возвращает полученные через @param array элементы массива задом наперёд
     */
    public static void cyclereturn(int[] array) {
        int[] container = array;
        for (int i = array.length - 1; i >= 0; i--) {
            int round = container[i];
            System.out.print(round + " ");
        }
        System.out.println("- список элементов массива задом наперёд при помощи цикла for");

        int ray = array.length - 1;
        while (ray >= 0) {
            int next = array[ray];
            System.out.print(next + " ");
            ray--;
        }
        System.out.println("- список элементов массива задом наперёд при помощи цикла while");

        int xray = array.length - 1;
        do {
            int next2 = array[xray];
            System.out.print(next2 + " ");
            xray--;
        } while (xray >= 0);
        System.out.println("- список элементов массива задом наперёд при помощи цикла do...while");
    }
}