package framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
    // public default Product createCopy() {
    //     Product p = null;
    //     try {
    //         p = (Product) clone();
    //     } catch (CloneNotSupportedException e) {
    //         e.printStackTrace();
    //     }
    //     return p;
    // }
}
