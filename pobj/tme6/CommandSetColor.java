package pobj.tme6;

import javafx.scene.paint.Color;

public class CommandSetColor implements ICommand {

	private Color c ;
	public CommandSetColor(Color c) {
		this.c=c;
	}
	@Override
	public void execute(IColorTurtle turtle) {
		turtle.setColor(c);
	}
	public Color getC() {
		return c;
	}
	public void setC(Color c) {
		this.c = c;
	}
}
