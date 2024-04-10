
public class DemoTees {
    public static void main(String[] args) {
        TeeShirt teeShirt1 = new TeeShirt();
        teeShirt1.setOrderNumber(101);
        teeShirt1.setSize("M");
        teeShirt1.setColor("Blue");

        TeeShirt teeShirt2 = new TeeShirt();
        teeShirt2.setOrderNumber(102);
        teeShirt2.setSize("XXL");
        teeShirt2.setColor("Red");

        CustomTee customTee1 = new CustomTee();
        customTee1.setOrderNumber(201);
        customTee1.setSize("S");
        customTee1.setColor("Green");
        customTee1.setSlogan("Java Rocks!");

        CustomTee customTee2 = new CustomTee();
        customTee2.setOrderNumber(202);
        customTee2.setSize("XXXL");
        customTee2.setColor("Black");
        customTee2.setSlogan("Code More!");

        System.out.println("TeeShirt 1: Order #" + teeShirt1.getOrderNumber() + ", Size: " + teeShirt1.getSize() + ", Color: " + teeShirt1.getColor() + ", Price: $" + teeShirt1.getPrice());
        System.out.println("TeeShirt 2: Order #" + teeShirt2.getOrderNumber() + ", Size: " + teeShirt2.getSize() + ", Color: " + teeShirt2.getColor() + ", Price: $" + teeShirt2.getPrice());

        System.out.println("CustomTee 1: Order #" + customTee1.getOrderNumber() + ", Size: " + customTee1.getSize() + ", Color: " + customTee1.getColor() + ", Slogan: \"" + customTee1.getSlogan() + "\", Price: $" + customTee1.getPrice());
        System.out.println("CustomTee 2: Order #" + customTee2.getOrderNumber() + ", Size: " + customTee2.getSize() + ", Color: " + customTee2.getColor() + ", Slogan: \"" + customTee2.getSlogan() + "\", Price: $" + customTee2.getPrice());
    }
}
