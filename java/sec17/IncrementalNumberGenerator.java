public class IncrementalNumberGenerator extends NumberGenerator {
	private int finish_number;
	private int incremental_number;
	private int number;

	public IncrementalNumberGenerator(int start_number, int finish_number, int incremental_number) {
		this.number = start_number;
		this.finish_number = finish_number;
		this.incremental_number = incremental_number;
	}

	@Override
	public int getNumber() {
		return number;
	};

	@Override
	public void execute() {
		while (number < finish_number) {
			notifyObservers();
			number += incremental_number;
		}
	};

}
