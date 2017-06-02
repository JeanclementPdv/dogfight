package jpu2016.dogfight.models;

public class Cloud extends Mobile{
	
	private int SPEED=1;
	private int WIDTH=300;
	private int HEIGHT = 150;
	private String IMAGE ="cloud";
	
	public Cloud(Direction direction, Dimension dimension){
		
		super(direction, null, dimension, HEIGHT, IMAGE);
	};

}