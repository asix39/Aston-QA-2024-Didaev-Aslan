package lesson6;

public class CheckArray {
    public static void checkSizeData(String arr[][])
            throws MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Ошибка.Размер массива должен быть - 4х4.");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException("Ошибка. Неверный формат данных в ячейке - [" + i + "][" + j + "].");
                }
            }
        }
        System.out.println("Сумма массива равна: " + sum);
    }
}
