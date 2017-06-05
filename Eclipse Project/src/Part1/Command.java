package Part1;

import java.util.List;

public abstract class Command {
	
	public boolean result = true;
	
	public Command(List<String> params){

		if(params != null){
			for(String s : params){
				if(s == null||s.isEmpty()){
					result = false;
					break;
				}
			}
		}
		else result = false;
	}
	

	
	public abstract void run();
}
