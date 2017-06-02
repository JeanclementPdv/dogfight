package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Sky;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	private IDogfightModel dogfightModel;
	private BufferedImage emptySky;
	
	public GraphicsBuilder(IDogfightModel dogfightModel){
		
		this.dogfightModel = dogfightModel;
		
	}
	
	private void buildEmptySky(){
		Graphics g;
		g.drawImage(this.dogfightModel.getIArea().getImage(),0,0,null);
	}
	
	private void drawMobile(IMobile mobile, Graphics g, ImageObserver observer){
		
	}

	@Override
	public void applyModelToGraphic(Graphics g, ImageObserver observer) {
		buildEmptySky();
		
	}

	@Override
	public int getGlobalWidth() {
		int result;
		
		result = this.dogfightModel.getIArea().getDimension().getWidth();
		
		return result;
	}

	@Override
	public int getGlobalHeight() {
		int result;
		
		result = this.dogfightModel.getIArea().getDimension().getHeight();
		
		return result;
	}
	
}
