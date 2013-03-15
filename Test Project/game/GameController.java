package game;

import java.util.TimerTask;

public class GameController extends TimerTask{

	public GameController() {
	}
	
	@Override
	public void run() {
		Main.d.repaint();
		Main.updatePhysics();
		Main.updateLevel();
	}
	
	
	
	

}
