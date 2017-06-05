package Part1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ManipulateFile extends Command {
	
	private String output;
	private String body;
	
	public ManipulateFile(List<String> params){
		super(params);
		
		if(super.result && params.size() == 3){
			output = params.get(1);
			body = params.get(2);
		}
		else super.result = false;
	}
	
	@Override
	public void run(){
		if(super.result){
			File tmp = new File(output);
			try {
				tmp.createNewFile();
				PrintWriter pw = new PrintWriter(output, "UTF-8");
				pw.write(body);
				pw.close();

			} catch (IOException e) {
				this.result = false;
			}
		}		
	}

}
