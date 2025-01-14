// Исключение для проверки размера массива
class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Исключение для проверки данных массива
class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}

// Класс с методами для работы с массивами
class ArrayProcessor {

    public int processArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в данных массива: строка " + i + ", колонка " + j);
                }
            }
        }

        return sum;
    }
}