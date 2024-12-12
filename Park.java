public class Park {
    private String parkName;    // Название парка
    private String location;    // Расположение

    // Конструктор
    public Park(String parkName, String location) {
        this.parkName = parkName;
        this.location = location;
    }

    // Геттеры и сеттеры
    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Внутренний класс Attraction
    public static class Attraction {
        private String name;       // Название аттракциона
        private String workHours;  // Время работы
        private double price;      // Цена

        // Конструктор
        public Attraction(String name, String workHours, double price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

        // Геттеры и сеттеры
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkHours() {
            return workHours;
        }

        public void setWorkHours(String workHours) {
            this.workHours = workHours;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price + " рублей");
            System.out.println("-----------------------------");
        }
    }

    // Метод для вывода информации о парке
    public void printParkInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println("Расположение: " + location);
        System.out.println("=============================");
    }
}
