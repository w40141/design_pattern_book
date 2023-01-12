public class CharDisplay2 extends AbstractDisplay2 {

	private char ch;

	public CharDisplay2(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	public void close() {
		System.out.println(">>");
	}

}
