import framework.Manager;
import framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MasseageBox mbox = new MasseageBox('*');
        MasseageBox sbox = new MasseageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello world");

        Product p2 = manager.create("warning box");
        p2.use("Hello world");

        Product p3 = manager.create("slash box");
        p3.use("Hello world");

        UnderlinePen2 upen2 = new UnderlinePen2('-');
        MasseageBox2 mbox2 = new MasseageBox2('*');
        MasseageBox2 sbox2 = new MasseageBox2('/');

        manager.register2("strong message2", upen2);
        manager.register2("warning box2", mbox2);
        manager.register2("slash box2", sbox2);

        Product p4 = manager.create("strong message2");
        p4.use("Hello world");

        Product p5 = manager.create("warning box2");
        p5.use("Hello world");

        Product p6 = manager.create("slash box2");
        p6.use("Hello world");
    }
}
