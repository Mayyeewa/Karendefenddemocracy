package week2;

import java.awt.event.MouseEvent;

import javax.sound.sampled.Line;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {
	public void run () {
		addMouseListeners();
	}
	
/** Called on mouse press to create a new line */
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
}
	
/** Called on mouse drag to reset the endpoint */
	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x,y);
	}
	
	/* Private instance variables */
		private GLine line;
	}
