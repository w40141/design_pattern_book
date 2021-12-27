import java.sec_06.

public class MasseageBox implements Product{
    private char decochar;

    public MasseageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void name(String s) {
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



}
