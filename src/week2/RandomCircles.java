package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles<rgen, rgen1> extends GraphicsProgram {
	
	
	/** Number of circles */
		private static final int NCIRCLES = 10;
		
	/** Minimum radius */
		private static final double MIN_RADIUS = 5;
		
	/** Maximum radius */
		private static final double MAX_RADIUS = 50;
		
		public void run() {
			for (int i = 0; i <NCIRCLES; i++) {
				double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
				double x = rgen.nextDouble(0, getWidth() - 2 * r);
				double y = rgen.nextDouble(0, getHeight() - 2 * r);
				GOval circle = new GOval (x, y, 2 * r, 2* r);
				circle.setFilled(true);
				circle.setColor(rgen.nextColor());
				add(circle);
			}
			
}
	/* Private instance variable */
		private RandomGenerator rgen = RandomGenerator.getInstance() ;


}
