package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.005);
		StdDraw.rectangle(0.5,0.7, 0.45,0.2);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.002);
		StdDraw.filledRectangle(0.5,0.3, 0.45,0.2);
		
	}
}