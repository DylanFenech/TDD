package Part2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import Part1.Toolbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BigBangStepDefinitions {

Toolbox tb = null;
		
	@When("^the bigbang toolbox is executed$")
	public void ExecuteCommand()
	{
		tb.execCommand();
	}
	
	@Then("^the bigbang toolbox result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, tb.getCommandOutcome());
	}

	@Given("manipulate file - bb$")
	public void ValidManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "test1.txt", "This is test one");
		tb = new Toolbox(params);
	}
	
	@Given("download file - bb$")
	public void EmptyManipulateFile(){
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		tb = new Toolbox(params);	
	}
	
	@Given("email - bb$")
	public void NullManipulateFile(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		tb = new Toolbox(params);
	}
	
}