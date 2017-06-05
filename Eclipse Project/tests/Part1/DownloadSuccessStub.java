package Part1;

import java.util.List;

public class DownloadSuccessStub extends Command {

	public DownloadSuccessStub(List<String> params) {
		super(params);
		
		if(params.size() != 3){
			super.result = false;
		}

	}

	@Override
	public void run() {
		if(super.result)
			super.result = true;
		else 
			super.result = false;
	}

}
