package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {	
	}
	public void moveUp() {	
	}
	private void moveRight() {	
	}
	private void moveDown() {	
	}
	private void moveLeft() {	
	}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
}