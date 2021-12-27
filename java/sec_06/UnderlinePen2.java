import framework.Product2;

public class UnderlinePen2 implements Product2 {
    private char ulchar;

    public UnderlinePen2(char ulchar) {
        this.ulchar = ulchar;
    }

    public UnderlinePen2(UnderlinePen2 prototype) {
        this.ulchar = prototype.ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product2 createCopy() {
        return new UnderlinePen2(this);
    }

}
