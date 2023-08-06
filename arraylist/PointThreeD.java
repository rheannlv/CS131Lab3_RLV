package arraylist;

public class PointThreeD {

	private double xPoint, yPoint, zPoint;
	
	public PointThreeD() {
		this.xPoint = 0.0;
		this.yPoint = 0.0;
		this.zPoint = 0.0;
	}//end empty constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor

	public double getxPoint() {
		return xPoint;
	}//end getX

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setX

	public double getyPoint() {
		return yPoint;
	}//end getY

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setY

	public double getzPoint() {
		return zPoint;
	}//end getZ

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setZ

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
	
}//end class
