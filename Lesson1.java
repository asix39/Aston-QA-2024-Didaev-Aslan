public class Lesson1 {
    public static void main(String[] args) {
        int t6 = -100;
        int t7 = 50;
        int t8 = 5;
        int year = 2024;
        int len = 5;
        int initialValue = 0;
        String s8 = ("Привет");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        task5();
        task6(t6);
        task7(t7);
        task8(s8, t8);
        task9(year);
        task10();
        task11();
        task12();
        task13();
        task14(len, initialValue);
    }
    public static void printThreeWords() {
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void checkSumSign() {
        int a = -4;
        int b = 4;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 100 ;
        if (value <= 0) {
            System.out.println ("Красный") ;
        } else if (value <= 100) {
            System.out.println ("Жёлтый") ;
        } else if (value >= 101) {
            System.out.println ("Зелёный") ;
        }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println ("a >= b");
        } else {
            System.out.println ("a < b");
        }
    }
    public static void task5() {
        int a = 10;
        int b = 5;
        int c = (a + b);
        if (c >= 10 && c <= 20) {
            System.out.println ("True");
        } else {
            System.out.println ("False");
        }
    }
    public static void task6(int t6) {
        System.out.println(t6 >= 0 ? "Positive" : "Negative");
    }
    public static void task7(int t7) {
        if (t7 < 0) {
            System.out.println("True");
        } else if ( t7 >= 0) {
            System.out.println("False");
        }
    }
    public static void task8(String s8, int t8) {
        int a = 0;
        for (a = 0; a < t8; a++) {
            System.out.println(s8);
        }
    }
    public static boolean task9(int year) {
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                leapYear = false;
            } else if (year % 400 == 0) {
                leapYear = true;
            }
        } return leapYear;
    }
    public static void task10() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void task11() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i] + " ");
        }
    }
    public static void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.println(arr[i]);
        }
    }
    public static void task13() {
        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }
}