package oop;

import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        printParamMug();
        printParamPhone();
        printParamLaptop();
        printParamFridge();
        printParamLamp();
        printParamKettle();
        Box table = new Box("Table","White");
        System.out.println(table.getName());

    }


    public static void printParamMug() {
        System.out.println("\nКружки");
        Mug cofeeCup = new Mug("Cofee Cup", "White", 0.2, "Ceramics", 0.5);
        Mug teaMug = new Mug("Tea Mug", "Blue", 0.25, "Glass", 1.25);
        Mug thermalMug = new Mug("Thermal Mug", "Black", 0.75, "Plastic", 3.75);
        String[] mug = new String[]{cofeeCup.getType(), teaMug.getType(), thermalMug.getType()};

        System.out.println(Arrays.toString(mug));
        System.out.println("cofeeCup.getColor() = " + cofeeCup.getColor());
        System.out.println("teaMug.getPrice() = " + teaMug.getPrice());
    }

    public static void printParamPhone() {
        System.out.println("\nТелефоны");
        Telephone xiaomi = new Telephone("Xiaomi", "Black", 150);
        Telephone iphone = new Telephone("Iphone", "Red", 1500);
        String[] phone = new String[]{xiaomi.getModel(), iphone.getModel()};
        double[] pricePhone = new double[]{xiaomi.getPrice(), iphone.getPrice()};

        System.out.println("Phone = " + Arrays.toString(phone));
        System.out.println("Price Phone = " + Arrays.toString(pricePhone));
    }

    private static void printParamLaptop() {
        System.out.println("\nНоутбуки");
        Laptop lenovo = new Laptop("Lenovo B590", 15000, 2000);
        Laptop hp = new Laptop("HP 590K", 35000, 6000);
        String[] model = new String[]{lenovo.getModel(), hp.getModel()};

        System.out.println(Arrays.toString(model));
    }

    private static void printParamFridge() {
        System.out.println("\nХолодильники");
        Fridge lg = new Fridge("LG 300", 120.5, "Grey", 380);
        Fridge samsung = new Fridge("Samsung", 130, "Blue", 410);
        String[] model = new String[]{lg.getModel(), samsung.getModel()};

        System.out.println(Arrays.toString(model));
    }

    private static void printParamLamp() {
        System.out.println("\nЛампы");
        Lamp tableLamp = new Lamp("Table Lamp", "Wood", "Warm", 45);
        Lamp torchere = new Lamp("Torchere", "Steel", "Cold", 55);
        String[] model = new String[]{tableLamp.getType(), torchere.getType()};

        System.out.println(Arrays.toString(model));
    }

    private static void printParamKettle() {
        System.out.println("\nЧайники");
        Kettle polaris = new Kettle("Polaris", 1.75, "Silver", 80);
        Kettle xioaomi = new Kettle("Xiaomi", 2, "White", 85);
        String[] model = new String[]{polaris.getModel(), xioaomi.getModel()};
        System.out.println(Arrays.toString(model));
    }

}
