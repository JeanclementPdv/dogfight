package jpu2016.dogfight.models;

public abstract class Mobile {
	
	public int speed ;
	
public Mobile (Direction direction, Position position , Dimension dimension, int speed, String image){
	
	
};

public Direction getDirection(){
	return null;
	
};

public void setDirection(Direction dimension){
	
};
public Point getPosition(){
	
};
public Dimension getDimension(){
	return null;
	
};
public int getSpeed(){
	return speed;
	
};
public int getWidth(){
	return speed;
	
};
public int getHeight(){
	return speed;
	
};

public void move(){
	
};

public void placeInArea (IArea area){
	
};

public boolean isPlayer(int player){
	return false;
		
};

private void moveUp(){
	
};
private void moveRight(){
	
};
private void moveLeft(){
	
};
public Color getColor(){
	
};
public IDogfightModel getDogfightModel(){
	return null;
	
};

public void setDogfightModel(IDogfightModel DogfightModel){
	
};

public boolean hit(){
	return false;
	
};
public boolean isWeapon(){
	return false;
	
};
public Image getImage(){
	
};



}
