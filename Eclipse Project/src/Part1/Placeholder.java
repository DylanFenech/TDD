package Part1;

import java.util.List;

public class Placeholder extends Command {
	
	public Placeholder(List<String> params){
		super(params);
		this.result = false;
	}
	
	@Override
	public void run(){
		this.result = false;
	}

}
