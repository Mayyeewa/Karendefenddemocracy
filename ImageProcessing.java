package week4;

import acm.graphics.GImage;

import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
		public void run() {
			}
	
	private GImage flipHorizontal (GImage image) {
		
		int[] [] array = image.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		for (int row = 0; row < height; row++) {
			for (int p1 =0; p1<width/2; p1++) {
				int p2 = width - p1 - 1;
				int flip = array[row] [p1];
				array[row] [p1] = array [row][p2];
				array [row] [p2] = flip;
			}
		}
		return new GImage(array);

	}	
}
		


			

		