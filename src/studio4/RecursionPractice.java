package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class RecursionPractice {
	public static void main(String args[]) {
		boxy(0.5, 0.5, 0.25);
	}
	public static void boxy(double x, double y, double h) {
        if (h > 0.0199) {
        	StdDraw.rectangle(x, y, h, h);
        	boxy(x+h, y-h, h/2);
        	boxy(x-h, y-h, h/2);  
        }
        	 	

//        if (h < 0.002) {
//        	
//        }
//        else {
//        	StdDraw.rectangle(x, y, h, h);
//        	boxy(x+h, y-h, h/2);
//        	boxy(x-h, y-h, h/2);   	
//        } //This also works

        
	}
}
