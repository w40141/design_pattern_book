import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");
	private JButton undoButton = new JButton("undo");

	public Main(String title) {
		super(title);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Command cmd = new DrawCommand(canvas, e.getPoint());
				history.append(cmd);
				cmd.execute();
			}
		});
		clearButton.addActionListener(e -> {
			history.clear();
			canvas.init();
			canvas.repaint();
		});
		redButton.addActionListener(e -> {
			Command cmd = new ColorCommand(canvas, Color.red);
			history.append(cmd);
			cmd.execute();
		});
		greenButton.addActionListener(e -> {
			Command cmd = new ColorCommand(canvas, Color.green);
			history.append(cmd);
			cmd.execute();
		});
		blueButton.addActionListener(e -> {
			Command cmd = new ColorCommand(canvas, Color.blue);
			history.append(cmd);
			cmd.execute();
		});
		undoButton.addActionListener(e -> {
			history.undo();
			canvas.repaint();
		});

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(redButton);
		buttonBox.add(greenButton);
		buttonBox.add(blueButton);
		buttonBox.add(undoButton);

		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}
}
