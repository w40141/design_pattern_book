import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context {
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private Button buttonUse = new Button("金庫使用");
	private Button buttonAlarm = new Button("非常ベル");
	private Button buttonPhone = new Button("通常通話");
	private Button buttonExit = new Button("終了");

	private State state = DayState.getInstance();

	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);

		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		add(panel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
		buttonUse.addActionListener(e -> state.doUse(this));
		buttonAlarm.addActionListener(e -> state.doAlarm(this));
		buttonPhone.addActionListener(e -> state.doPhone(this));
		buttonExit.addActionListener(e -> System.exit(0));
	}

	@Override
	public void setClock(int hour) {
		String clockString = String.format("Now: %02d:00", hour);
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		System.out.println("Change to " + state + " from " + this.state);
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("Call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("Record ... " + msg + "\n");
	}
}
