public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make1, String model1, short year1, int price1) {
        make = make1;
        model = model1;
        year = year1;
        price = price1;
    }

    void display() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(price);

    }
}
     class Main {
        public static void main(String[] args) {
            Car c1 = new Car("Mercedes", "AT567", (short) 2020, 500000);
            Car c2 = new Car("BMW", "BU789", (short) 2021, 700000);
            c1.display();
            c2.display();
        }
        }



