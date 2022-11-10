package studio4;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class RecursionPractice2 {
	public static void main(String args[]) {
		while(true) {
			System.out.println(direction());
		}
		
		//zeno(0.5);
		
//		Scanner ap = new Scanner(System.in);
//		double height = ap.nextDouble();
//		double heightm = height * .3048;
//		double heightm2dp = (int) (heightm * 100) / 100.0;
//
//		System.out.println("Height in meters " + heightm2dp);
//		double width = ap.nextDouble();
//		double widthm = width * 0.3048;
//		double widthm2dp = (int) (widthm * 100) / 100.0;
//
//		System.out.println("Width in meters " + widthm2dp);
//		double depth = ap.nextDouble();
//		double depthm = depth * 0.3048;
//		double depthm2dp = (int) (depthm * 100) / 100.0;
//
//		System.out.println("Depth in meters " + depthm2dp);
		
		//System.out.println(fun(4));
		
		//carpet(0.5, 0.5, 0.1);
	}
	
	public static void prompter(String description, Scanner in) {
		//Fill here
	}
	
	public static void zeno(double x) {
		if (x > 0.99) {
			return;
		} else {
			StdDraw.line(x, 0, x, 1);
			zeno(x + 0.5*(1-x));
		}
	}
	
	//fun(4) = fun(7) + 1;
	//fun(7) = fun(13) + 1;
	//fun(13) = fun(25) + 1;
	//fun(25) = fun(49) + 1;
	//fun(49) = 49;
	//fun(25) = 49 + 1;
	//fun(13) = 50 + 1;
	//fun(7) = 51 + 1;
	//fun(4) = 52 + 1;
	//fun(4) = 53;
	
	//main is at the bottom of the call stack
	
	public static int fun(int k) {
		if (k > 25) {
			return k;
		} else {
			return fun(k * 2 - 1) + 1;
		}
	}
	
	public static void carpet(double x, double y, double w) {
		if (w > 0.001) {
			StdDraw.filledSquare(x, y, w);
			carpet(x - 2*w, y + 2*w, w/3);
			carpet(x - 2*w, y - 2*w, w/3);
			carpet(x + 2*w, y + 2*w, w/3);
			carpet(x + 2*w, y - 2*w, w/3);
		}
		
	}
	
	public static int direction() {
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))
			return 3;
		else if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT))
			return 1;
		else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))
			return 2;
		else 
			return 0;
	}
}