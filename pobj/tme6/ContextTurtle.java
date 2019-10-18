package pobj.tme6;

import javafx.scene.paint.Color;

public class ContextTurtle extends ColorTurtle implements IColorTurtle {

	private IContext turle;
	private Color c;
	public ContextTurtle(IContext turle) {
		this.turle = turle;
		c=Color.BLACK;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		turle.drawLine(x1, y1, x2, y2, c);
	}
}
