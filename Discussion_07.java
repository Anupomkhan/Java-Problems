public class Discussion_07 {
    public static void main(String[] args) {
        Car car = new Car("Rahim", "Toyota", "CAR-101", 45.5);
        car.start();
        car.checkFuel();
        car.stop();

        System.out.println();

        Dog dog = new Dog("Tommy", 3, "German Shepherd");
        dog.bark();
        dog.spin();
        dog.run();

        System.out.println();

        Book book1 = new Book("Java Basics");
        Book book2 = new Book("OOP in Java", "John Smith");

        book1.showInfo();
        book2.showInfo();
    }

    // Practice Problem 05
    static class Car {
        String owner;
        String brandName;
        String serialNumber;
        double fuel;

        Car(String owner, String brandName, String serialNumber, double fuel) {
            this.owner = owner;
            this.brandName = brandName;
            this.serialNumber = serialNumber;
            this.fuel = fuel;
        }

        void start() {
            System.out.println(this.brandName + " car started.");
        }

        void stop() {
            System.out.println(this.brandName + " car stopped.");
        }

        void checkFuel() {
            System.out.println("Fuel left: " + this.fuel + " liters");
        }
    }

    // Practice Problem 05(contd.)
    static class Dog {
        String name;
        int age;
        String breed;

        Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        void bark() {
            System.out.println(this.name + " is barking.");
        }

        void spin() {
            System.out.println(this.name + " is spinning.");
        }

        void run() {
            System.out.println(this.name + " is running.");
        }
    }

    // Practice Problem 05(contd.)
    static class Book {
        String title;
        String author;

        Book(String title) {
            this.title = title;
        }

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void showInfo() {
            System.out.println("Title: " + this.title);

            if (this.author != null) {
                System.out.println("Author: " + this.author);
            }
        }
    }
}
