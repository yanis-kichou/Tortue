package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtle extends Turtle implements IColorTurtle {
	
	private Color c;
	public ColorTurtle() {
		super();
		c=Color.BLACK;
	}
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.print(x1 +" "+ y1 +" "+x2+" "+ y2 +" "+c.toString()+"\n");
	}

	@Override
	public void setColor(Color color) {
		c = color;
	}
}
