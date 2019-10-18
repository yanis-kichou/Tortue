package pobj.tme6;

public class CommandMove implements ICommand {

	private int l;

	public CommandMove(int l) {
		this.l=l;
	}

	@Override
	public void execute(IColorTurtle turtle) {
		turtle.move(l);
	}
	
	
}
