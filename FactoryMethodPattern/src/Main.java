import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Jasper");
        Product card2 = factory.create("Kenny");

        card1.use();
        card2.use();
    }
}
