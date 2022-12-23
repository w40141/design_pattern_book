import java.util.ArrayList;

public class MultiStringDisplay extends Display {
	private ArrayList<String> strings;
	private int columns = 0;

	public MultiStringDisplay() {
		this.strings = new ArrayList<>();
	}

	public void add(String md) {
		strings.add(md);
		if (md.length() > columns) {
			columns = md.length();
		}
		updatePadding();
	}

	private void updatePadding() {
		for (int i = 0; i < strings.size(); i++) {
			String line = strings.get(i);
			int count = columns - line.length();
			if (count > 0) {
				strings.set(i, line + makeSpaces(count));
			}
		}
	}

	private String makeSpaces(int count) {
		return " ".repeat(count);
	}

	@Override
	public int getColumns() {
		return columns;
	}

	@Override
	public int getRows() {
		return strings.size();
	}

	@Override
	public String getRowText(int row) {
		return strings.get(row);
	}

}
