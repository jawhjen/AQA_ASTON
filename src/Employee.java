public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор
    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class MainEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Петров Петя",
                "Тестировщик",
                "petr.petrov@gmail.com",
                "+375293335555",
                2000,
                33
        );

        employee.printInfo();

        employee.setPosition("Старший тестировщик");
        employee.setSalary(2500);

        System.out.println("\nОбновленная информация:");
        employee.printInfo();
    }
}

//2 массив сотрудников
class EmployeeTwo {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор для инициализации
    public EmployeeTwo(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("---------------------");
    }
}

class MainEmployeeTwo {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 3000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 5000, 35);
        employeeArray[2] = new Employee("Sidorov Alex", "Director", "sidorov@mailbox.com", "892312314", 7000, 50);
        employeeArray[3] = new Employee("Smirnov Sergey", "Developer", "smirnov@mailbox.com", "892312315", 4000, 28);
        employeeArray[4] = new Employee("Kuznetsov Viktor", "Tester", "kuznetsov@mailbox.com", "892312316", 3500, 32);

        for (Employee employee : employeeArray) {
            employee.printInfo();
        }
    }
}
//3 park
public class Park {
  //общая инфа
    private String parkName;
    private String location;

    // конструктор
    public Park(String parkName, String location) {
        this.parkName = parkName;
        this.location = location;
    }

    //
    // информация об аттракционах
    public class Attraction {
        private String name;
        private String workHours;
        private double price;

        // конструктор
        public Attraction(String name, String workHours, double price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

        // метод вывода
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price + " рублей");
            System.out.println("-----------------------------");
        }
    }

    public void printParkInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println("Расположение: " + location);
        System.out.println("=============================");
    }
}>>

