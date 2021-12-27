package java.sec_04.idcard;

import java.sec_04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int number;

    IDCard(String owner, int number) {
        System.out.println(owner + "のカードをID: " + number + " として作ります。");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + ", Number: " + number + "]";
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber(){
        return this.number;
    }
}
