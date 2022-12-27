public class Main {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(5);

    IncreaseDisplay d4 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
    IncreaseDisplay d5 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
    d4.increaseDisplay(4);
    d5.increaseDisplay(6);
  }
}
