package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double greenTrix[]= {0,0,1};
		double greenTriy[]= {0,1,1};
		StdDraw.setPenColor(19,76,17);
		StdDraw.filledPolygon(greenTrix, greenTriy);
		double greyTrix[]= {0,1,1};
		double greyTriy[]= {0,0,1};
		StdDraw.setPenColor(117,121,138);
		StdDraw.filledPolygon(greyTrix, greyTriy);
		StdDraw.setPenColor(211,147,188);
		StdDraw.filledSquare(0.5,0.5,0.1);
		StdDraw.filledCircle(0.5, 0.6,0.1);
		
		StdDraw.setPenColor(163,24,32);
		double skrimpHeadx[]= {0.5,0.55,0.45};
		double skrimpHeady[]= {0.6,0.578,0.56};
		StdDraw.filledPolygon(skrimpHeadx, skrimpHeady);
		double skrimpBodyx[]= {0.45,0.49,0.525};
		double skrimpBodyy[]= {0.56,0.569,0.45};
		StdDraw.filledPolygon(skrimpBodyx, skrimpBodyy);
		double skrimpTailx[]= {0.525,0.52,0.55};
		double skrimpTaily[]= {0.45,0.465,0.49};
		StdDraw.filledPolygon(skrimpTailx, skrimpTaily);
		
		StdDraw.setPenColor(226,255,0);
		StdDraw.setPenRadius(0.005);
		StdDraw.point(0.535,0.575);
		StdDraw.point(0.54,0.58);
		
		
	}
}