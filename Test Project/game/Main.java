package game;


import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Timer;

import tools.PhysicsObject;
import tools.Renderable;

import levels.Level;
import levels.Test;

public class Main {

	/**
	 * @param args
	 */
	public static GameController game;
	public static ArrayList<Level> levels;
	public static int current = 0;
	public static Display d = new Display("Game",1000,500);
	
	public static void main(String[] args) {
		levels = new ArrayList<Level>();
		levels.add(new Test());
		
		game = new GameController();
		Timer t = new Timer();
		t.schedule(game, 0, 33);
		levels.get(current).run();
		d.addKeyListener(levels.get(current));
	}
	public static ArrayList<Renderable> getRenders(){
		return levels.get(current).renders;
	}
	public static void nextLevel(){
		d.removeMouseListener(levels.get(current));
		d.removeMouseListener(levels.get(current));
		current++;
		d.addKeyListener(levels.get(current));
		d.addMouseListener(levels.get(current));
		
	}
	public static void updateLevel(){
		levels.get(current).update();
	}
	public static void updatePhysics(){
		try{
		for(PhysicsObject p :levels.get(current).physics){
			p.updatePhysics();
		}
		}catch (ConcurrentModificationException e){
			System.out.println("test");
		}
	}

}
