package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import game.Memento;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();

	private static String[] fruitsName = {
			"りんご", "ぶどう", "バナナ", "みかん"
	};

	public Gamer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	private String getFruit() {
		String f = fruitsName[random.nextInt(fruitsName.length)];
		if (random.nextBoolean()) {
			return "おいしい" + f;
		} else {
			return f;
		}
	}

	@Override
	public String toString() {
		return "[money = " + money + ", fruits = " + fruits + "]";
	}

	public void bet() {
		int dice = random.nextInt(6) + 1;
		if (dice == 1) {
			money += 100;
			System.out.println("所持金が増えました。");
		} else if (dice == 2) {
			money /= 2;
			System.out.println("所持金が半分になりました。");
		} else if (dice == 6) {
			String f = getFruit();
			System.out.println("フルーツ (" + f + ") をもらいました。");
			fruits.add(f);
		}
	}

	public Memento createMemento() {
		Memento m = new Memento(money);
		for (String f : fruits) {
			if (f.startsWith("おいしい")) {
				m.addFruit(f);
			}
		}
		return m;
	}

	public void restoreMemento(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}
}
