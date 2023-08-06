package arraylist;

public class Square {

	private double side;
	
	public Square() {
		this.side = 0.0;
	}//end empty constructor
	
	public Square(double s) {
		side = s;
	}//end empty preferred constructor

	public double getSide() {
		return side;
	}//end getSide

	public void setSide(double side) {
		this.side = side;
	}//end setSide
	
	public double getArea() {
		return side*side;
	}//end getArea

	@Override
	public String toString() {
		return "Square [Side=" + side + ", Area=" + getArea() + "]";
	}

}//end class
