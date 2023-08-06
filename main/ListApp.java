package main;
import arraylist.*;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.addItem(new String ("chickens"));
		stringList.addItem(new String ("Mila"));
		stringList.addItem(new String ("Maple"));
		stringList.addItem(new String ("cheese"));
		stringList.addItem(new String ("Jorge"));
		stringList.addItem(new String ("bears"));
		stringList.addItem(new String ("mountains"));
		System.out.println(stringList.addItem (new String ("beach")));
		System.out.println(stringList.toString());

		
		ArrayList<Square> squareList = new ArrayList<Square>();
		squareList.addItem(new Square (20.3));
		squareList.addItem(new Square (21.3));
		squareList.addItem(new Square (22.3));
		squareList.addItem(new Square (23.3));	
		squareList.addItem(new Square (24.3));
		System.out.println(squareList.addItem(new Square (25.5)));
		System.out.println(squareList.toString());
		
		ArrayList<PointThreeD> pt3List = new ArrayList<PointThreeD>();
		pt3List.addItem(new PointThreeD (6.2, 7.2, 8.2));
		pt3List.addItem(new PointThreeD (1.2, 2.2, 3.2));
		pt3List.addItem(new PointThreeD (4.2, 5.2, 6.2));
		pt3List.addItem(new PointThreeD (9.2, 8.2, 7.2));
		pt3List.addItem(new PointThreeD (2.2, 4.2, 6.2));
		pt3List.addItem(new PointThreeD (7.3, 8.3, 9.3));
		pt3List.addItem(new PointThreeD (1.3, 3.3, 5.3));
		pt3List.addItem(new PointThreeD (1.0, 1.0, 1.0));
		pt3List.addItem(new PointThreeD (0.5, 1.5, 2.5));
		pt3List.addItem(new PointThreeD (6.2, 7.2, 4.2));
		System.out.println(pt3List.addItem(new PointThreeD ()));
		System.out.println(pt3List.toString());
	

	}//end main

}//end class
