package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtleAdapter implements IColorTurtle {
	
	private ITurtle turtle;

	public ColorTurtleAdapter( ITurtle turtle) {
		this.turtle=turtle;
	}
	
	@Override
	public void move(int length) {
		turtle.move(length);
	
	}

	@Override
	public void turn(int angle) {
		turtle.turn(angle);
	}

	@Override
	public void up() {
		turtle.up();
	}

	@Override
	public void down() {
		turtle.down();
	}

	@Override
	public void setColor(Color color) {	
		((IColorTurtle)turtle).setColor(color);
	}

}
