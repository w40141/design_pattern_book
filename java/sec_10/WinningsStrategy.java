import java.util.Random;

/**
 * WinningsStrategy
 */
public class WinningsStrategy implements Strategy {
  private Random random;
  private boolean won;
  private Hand prevHand;

  public WinningsStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    if (!won) {
      prevHand = Hand.getHand(random.nextInt(3));
    }
    return prevHand;
  }

  @Override
  public void study(boolean win) {
    won = win;
  }

}
