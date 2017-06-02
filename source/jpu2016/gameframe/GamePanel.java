package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	private IGraphicsBuilder graphicsBuilder;
	private Observable observable;
	
	public GamePanel(IGraphicsBuilder graphicBuilder){
		
		this.graphicsBuilder = graphicBuilder;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		
		this.repaint();
		
	}
	
	public void paintComponent(Graphics g){
		
		this.graphicsBuilder.applyModelToGraphic(g, (ImageObserver) this.observable);
	}

}
