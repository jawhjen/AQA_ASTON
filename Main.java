public class Main {
    public static void main(String[] args) {
// Запуск задания 1
        Tasks.printThreeWords();

        // Запуск задания 2
        Tasks.checkSumSign();

        // Запуск задания 3
        Tasks.printColor();

        // Запуск задания 4
        Tasks.compareNumbers();

        // Запуск задания 5
        System.out.println(Tasks.limitCheck(9, 10));

        // Запуск задания 6
        Tasks.outputOfNumber(1);
        Tasks.outputOfNumber(-2);
        Tasks.outputOfNumber(0);

        // Запуск задания 7
        System.out.println(Tasks.checkNumber(-2));

        // Запуск задания 8
        Tasks.printLine("HelloWorld", 7);

        // Запуск задания 9
        System.out.println(Tasks.highYear(2024));

        // Запуск задания 10
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Tasks.toggleArrayValues(array);
        Tasks.printArray(array);

        // Запуск задания 11
        Tasks.fillArray();

        // Запуск задания 12
        int[] arrayToProcess = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Tasks.processArray(arrayToProcess);

        // Запуск задания 13
        Tasks.diagonalMatrix(5);

        // Запуск задания 14
        int[] resultArray = Tasks.returnArray(5, 10);
        Tasks.printArray(resultArray);


        // Задание 1: Создание сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mail.com", "892312312", 3000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petr@mail.com", "892345612", 4000, 40);
        employees[2] = new Employee("Sidorov Alex", "Developer", "alex@mail.com", "891234567", 5000, 35);
        employees[3] = new Employee("Kuznetsov Oleg", "Analyst", "oleg@mail.com", "899912345", 3500, 28);
        employees[4] = new Employee("Smirnov Sergey", "Tester", "sergey@mail.com", "899876543", 3200, 25);

        // Вывод информации о сотрудниках
        System.out.println("Сотрудники компании:");
        for (Employee employee : employees) {
            employee.printInfo();
        }

        // Задание 2: Создание парка и аттракционов
        Park park = new Park("Диво Остров", "Санкт-Петербург");

        // Создание аттракционов
        Park.Attraction rollerCoaster = new Park.Attraction("Американские горки", "10:00 - 22:00", 500);
        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "09:00 - 20:00", 300);
        Park.Attraction hauntedHouse = new Park.Attraction("Дом ужасов", "12:00 - 23:00", 400);

        // Вывод информации о парке и аттракционах
        park.printParkInfo();
        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        hauntedHouse.printInfo();
    }
}
