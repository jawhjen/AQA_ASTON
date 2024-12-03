//1
public class Main {
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
//2
class MainOne{
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 27;
        int b = -13;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
//3
class MainTwo {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 39;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
}
//4
class MainThree {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 13;
        int b = 13;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
//5
class MainFour {
    public static void main(String[] args) {
        System.out.println(limitCheck(9, 10));
        System.out.println(limitCheck(1, 2));
    }

    public static boolean limitCheck(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
//6
class MainFive {
    public static void main(String[] args) {
        outputOfNumber(1);
        outputOfNumber(-2);
        outputOfNumber(0);
    }

    public static void outputOfNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
//7
class MainSix {
    public static void main(String[] args) {
        System.out.println(checkNumber(-2));
        System.out.println(checkNumber(13));
        System.out.println(checkNumber(0));
    }

    public static boolean checkNumber(int number) {
        return number < 0;
    }
}


//8
class MainSeven {
    public static void main(String[] args) {
        printLine("HelloWorld", 7);
    }

    public static void printLine(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
//9
class MainEight {
    public static void main(String[] args) {
        System.out.println(highYear(2024));
        System.out.println(highYear(2025));
        System.out.println(highYear(2020));
        System.out.println(highYear(2023));
    }

    public static boolean highYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
//10
class MainNine {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("До замены:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        System.out.println("После замены:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
//11
class MainTen {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }


        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
//12
class MainEleven{
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("До обработки:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println("После обработки:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
//13
class MainTwelth {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];


        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }


        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
//14
class MainThirteenth {
    public static void main(String[] args) {
        int[] resultArray = returnArray(5, 10);
        printArray(resultArray);
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}








