package game;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Display extends JFrame{

	public Display(String windowName) {
		super(windowName);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setContentPane(new Pane());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public Display(String windowName,int w,int h) {
		super(windowName);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(w,h);
		this.setContentPane(new Pane());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
