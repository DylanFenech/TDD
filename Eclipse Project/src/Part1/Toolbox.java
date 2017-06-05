package Part1;

import java.util.List;

public class Toolbox {
	public Command cmd;
	
	public Toolbox(List<String> params){
		cmd = CommandFactory.parseCommand(params);
	}
	
	public void execCommand(){
		cmd.run();
	}
	
	public boolean getCommandOutcome(){
		return cmd.result;
	}
	
}	
