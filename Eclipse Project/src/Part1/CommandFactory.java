package Part1;

import java.util.Arrays;
import java.util.List;

public class CommandFactory {
	public static Command parseCommand(List<String> params){
		
		if(params != null && params.size() > 0){
			if(params.get(0).equals("Manipulate"))
				return new ManipulateFile(params);
			else if (params.get(0).equals("Download"))
				return new DownloadFile(params);
			else if(params.get(0).equals("Email"))
				return new SendEmail(params);
			else return new Placeholder(params);
			
		}
		
		else return new Placeholder(Arrays.asList(""));
		
		
		
	}
}
