// Основной класс с методом main
public class Main {
    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();

        // Пример корректного массива
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива с неправильными данными
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива неправильного размера
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        // Обработка исключений для каждого массива
        try {
            System.out.println("Сумма элементов validArray: " + processor.processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов invalidDataArray: " + processor.processArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов invalidSizeArray: " + processor.processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
