package pobj.tme6;

public class CommandTurn implements ICommand {

	private int length;
	public CommandTurn(int lngth) {
		this.length=lngth;
		}
	@Override
	public void execute(IColorTurtle turtle) {
		turtle.turn(length);
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

}
