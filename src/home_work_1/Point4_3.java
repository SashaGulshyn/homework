package src.home_work_1;

public class Point4_3 {
    public static void main(String[] args) {
        int b = 3;
        for (int a = 1; a <=6; a++) {
           if (a % b == 0) {
               System.out.println(a + " - делится на 3 без остатка");
           }else{
               System.out.println(a + " - НЕ делится на 3 без остатка");
           }
        }
    }
}

