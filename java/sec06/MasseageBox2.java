import framework.Product2;

public class MasseageBox2 implements Product2 {
    private char decochar;

    public MasseageBox2(char decochar) {
        this.decochar = decochar;
    }

    public MasseageBox2(MasseageBox2 prototype) {
        this.decochar = prototype.decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product2 createCopy() {
        return new MasseageBox2(this);
    }
}
