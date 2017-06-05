package Part2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Part1.Toolbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailStepDefinitions {

Toolbox tb = null;
		
	@When("^email is executed$")
	public void ExecuteCommand()
	{
		tb.execCommand();
	}
	
	@Then("^email result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, tb.getCommandOutcome());
	}

	/* Email */
	
	@Given("^email valid$")
	public void ValidEmail(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		tb = new Toolbox(params);
	}
	
	@Given("^email empty params$")
	public void EmptyEmail(){
		List<String> params = Arrays.asList("Email", "", "");
		tb = new Toolbox(params);
	}
	
	@Given("^email null params$")
	public void NullEmail(){
		List<String> params = Arrays.asList("Email", null, null);
		tb = new Toolbox(params);
	}
	
	@Given("^email missing params$")
	public void MissingEmail(){
		List<String> params = Arrays.asList("Email");
		tb = new Toolbox(params);
	}
	
	@Given("^email empty params list$")
	public void EmptyEmailName(){
		List<String> params = new ArrayList<String>();
		tb = new Toolbox(params);
	}
	
	
	
}