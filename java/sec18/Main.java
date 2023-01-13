import game.Memento;
import game.Gamer;

public class Main {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();

		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("Now: " + gamer);

			gamer.bet();

			System.out.println("Money: " + gamer.getMoney());

			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("Save");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("Restore");
				gamer.restoreMemento(memento);
			}

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println();
			}
		}
	}
}
