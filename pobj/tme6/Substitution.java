package pobj.tme6;

import java.util.List;

public class Substitution {

	static public ICommand substitute(ICommand org, ICommand subst) {
		if (org instanceof CommandMove)
			return subst;
		if (org instanceof CommandList) {
			CommandList l = new CommandList();
			List<ICommand> e = ((CommandList)org).getCommandes();
			for (ICommand c : e) {
				
				if (c instanceof CommandMove)
					l.addCommand(subst);
				else {
					l.addCommand(c);
				}
			}
			
			return l;
		}
		return org;
	}
}
