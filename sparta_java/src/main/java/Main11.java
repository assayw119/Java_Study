class Phone2 {
    String model;
    String color;
    int price;

    public Phone2(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    } // Command + N -> Constructor
}

public class Main11 {
    public static void main(String[] args) {
        Phone2 galaxy = new Phone2("galaxy10", "black", 100);

        Phone2 iphone = new Phone2("iphoneX", "black", 200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}