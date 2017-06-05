package Part1;

import java.util.List;

public class FailCommandStub extends Command {

	public FailCommandStub(List<String> params) {
		super(params);

	}

	@Override
	public void run() {
		super.result = false;
	}

}
