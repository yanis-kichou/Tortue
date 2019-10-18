package pobj.tme6;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {

	private List<ICommand> commandes=new ArrayList<ICommand>();
	
	public void addCommand(ICommand command) {
		commandes.add(command);
	}

	public void execute(IColorTurtle turtle) {
		for (int i=0;i<commandes.size();i++)
		commandes.get(i).execute(turtle);
	}
	public List<ICommand> getCommandes(){
		return commandes;
	}
}
