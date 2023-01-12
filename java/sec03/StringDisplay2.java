public class StringDisplay2 extends AbstractDisplay2 {

	private String string;
	private int width;

	public StringDisplay2(String string) {
		this.string = string;
		width = string.length();
	}

	public void open() {
		printLine();
	}

	public void print() {
		System.out.println("|" + string + "|");
	}

	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
