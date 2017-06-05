package Part2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import Part1.Toolbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManipulateFileStepDefinitions {

Toolbox tb = null;
		
	@When("^manipulate is executed$")
	public void ExecuteCommand()
	{
		tb.execCommand();
	}
	
	@Then("^manipulate result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, tb.getCommandOutcome());
	}

	/* Manipulate File */
	
	@Given("^manipulate valid$")
	public void ValidManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "DriverTest.txt", "This is test with driver");
		tb = new Toolbox(params);
	}
	
	@Given("^manipulate empty params$")
	public void EmptyManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "", "");
		tb = new Toolbox(params);
	}
	
	@Given("^manipulate null params$")
	public void NullManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", null, null);
		tb = new Toolbox(params);
	}
	
	@Given("^manipulate missing params$")
	public void MissingManipulateFile(){
		List<String> params = Arrays.asList("Manipulate");
		tb = new Toolbox(params);
	}
	
	@Given("^manipulate empty file name$")
	public void EmptyManipulateFileName(){
		List<String> params = Arrays.asList("Manipulate", "", "This is a great test");
		tb = new Toolbox(params);
	}
	
	
	
}