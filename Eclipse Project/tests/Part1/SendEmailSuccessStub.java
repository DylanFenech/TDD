package Part1;

import java.util.List;

public class SendEmailSuccessStub extends Command {

	public SendEmailSuccessStub(List<String> params) {
		super(params);
		
		if(params.size() != 5){
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
