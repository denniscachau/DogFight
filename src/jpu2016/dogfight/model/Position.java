package jpu2016.dogfight.model;

public class Position extends Mobile{
	private double x;
	private double y;
	private double maxX;
	private double maxY;

	public Position(double x, double maxX, double y, double maxY) {
	
	}
	public Position(Position position) {
		
	}
	public double getX() {
		return 1;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return 1;
	}
	public void setY(double y) {
		this.y = y;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}