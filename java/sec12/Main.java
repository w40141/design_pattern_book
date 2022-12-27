public class Main {
  public static void main(String[] args) {
    Display b1 = new StringDisplay("Hello world.");
    Display b2 = new SideBorder(b1, '#');
    Display b3 = new FullBorder(b2);
    b1.show();
    b2.show();
    b3.show();

    Display b4 = new SideBorder(
        new FullBorder(
            new FullBorder(
                new SideBorder(
                    new FullBorder(
                        new StringDisplay("Hello, world.")),
                    '*'))),
        '/');
    b4.show();

    Display b6 = new UpDownBorder(b1, '#');
    b6.show();

    MultiStringDisplay md = new MultiStringDisplay();
    md.add("Hello");
    md.add("konnnichiwa");
    md.add("world");
    md.show();

    Display b7 = new SideBorder(md, '#');
    b7.show();
    Display b8 = new FullBorder(md);
    b8.show();
  }

}
