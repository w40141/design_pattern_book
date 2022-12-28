import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * ColleagueTextField
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int colums) {
		super(text, colums);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
	};

}
