package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.05);

		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameter1 = in.nextDouble();
		double parameter2 = in.nextDouble();
		double parameter3 = in.nextDouble();
		double parameter4 = in.nextDouble();

		if (shape.equals("ellipse")) {
			if (isFilled) {
				StdDraw.filledEllipse(parameter1, parameter2, parameter3, parameter4);
			} else {
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.ellipse(parameter1, parameter2, parameter3, parameter4);
			}
		}
		// System.out.println(shape + " " + redComponent + " " + isFilled);

	}
}
