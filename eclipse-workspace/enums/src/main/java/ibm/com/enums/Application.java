package ibm.com.enums;

enum Apple {
    GoldenDel(10),
    RedDel(15),
    Gala(12);

    private final int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Application {
    public static void main(String[] args) {
        Apple[] apples = Apple.values();

        for (Apple apple : apples) {
            System.out.println(apple + " costs " + apple.getPrice());
        }

        // Example of using valueOf to get an enum constant from a string
        Apple selectedApple = Apple.valueOf("Gala");
        System.out.println("Selected apple: " + selectedApple + " costs " + selectedApple.getPrice());
    }
}
