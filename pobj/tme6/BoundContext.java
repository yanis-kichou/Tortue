package pobj.tme6;

import javafx.scene.paint.Color;

public class BoundContext implements IContext {

	private int minX=0, maxX=0, minY=0, maxY=0;

	@Override
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		if(minX>x1)
			minX=x1;
		if(minX>x2)
			minX=x2;
		if(minY>y1)
			minY=y1;
		if(minY>y2)
			minY=y2;
		if(maxX<x1)
			maxX=x1;
		if(maxX<x2)
			maxX=x2;
		if(maxY<y1)
			maxY=y1;
		if(maxY<y2)
			maxY=y2;
	}



	public int getMaxX() {
		// TODO Auto-generated method stub
		return maxX;
	}

	public int getMinX() {
		// TODO Auto-generated method stub
		return minX;
	}



	public int getMinY() {
		// TODO Auto-generated method stub
		return minY;
	}



	public int getMaxY() {
		// TODO Auto-generated method stub
		return maxY;
	}
}
