package game;


import java.awt.Graphics;

import javax.swing.JPanel;

import tools.Renderable;

public class Pane extends JPanel{

	public Pane() {
		
	}
	
	public void paintComponent(Graphics g){
		for(Renderable r: Main.getRenders()){
			r.draw(g);
		}
		
		
	}

}
