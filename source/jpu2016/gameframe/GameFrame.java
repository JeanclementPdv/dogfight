package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {

	private IEventPerformer eventPerformer;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable){
		
		this.setTitle(title);
		this.setSize(400,400);              
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.eventPerformer = performer;
	    GamePanel panel = new GamePanel(graphicBuilder);
	    
	    observable.addObserver(panel);
	    
	    this.setContentPane(panel);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		
		this.eventPerformer.eventPerform(event);
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
		this.eventPerformer.eventPerform(event);
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		
		this.eventPerformer.eventPerform(event);
		
	}
}
