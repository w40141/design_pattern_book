package java.sec_05;

public class Singleton {
    private static Singleton singletion = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }

    public static Singleton getInstance() {
        return singletion;
    }
}
