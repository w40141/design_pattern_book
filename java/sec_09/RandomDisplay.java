import java.util.Random;

public class RandomDisplay extends CountDisplay {
  private Random rand = new Random();

  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void randomDisplay(int times) {
    multiDisplay(rand.nextInt(times));
  }
}
