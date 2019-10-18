package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle {
	private CommandList commendList = new CommandList();

	public CommandList getCommand() {
		return commendList;
	}

	@Override
	public void move(int length) {
		commendList.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		commendList.addCommand(new CommandTurn(angle));

	}

	@Override
	public void up() {
		commendList.addCommand(new CommandUp());
	}

	@Override
	public void down() {
		commendList.addCommand(new CommandDown());
	}

	@Override
	public void setColor(Color color) {
		commendList.addCommand(new CommandSetColor(color));
	}

}
