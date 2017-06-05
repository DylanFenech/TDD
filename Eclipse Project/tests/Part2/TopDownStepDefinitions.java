package Part2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import Part1.DownloadSuccessStub;
import Part1.FailCommandStub;
import Part1.ManipulateSuccessStub;
import Part1.SendEmailSuccessStub;
import Part1.Toolbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopDownStepDefinitions {

Toolbox tb = null;
	
/* Command usage */

	@When("^the topdown toolbox is executed$")
	public void ExecuteCommand()
	{
		tb.execCommand();
	}
	
	@Then("^the topdown toolbox result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, tb.getCommandOutcome());
	}

	/* Generic Command */
	
	@Given("command is given invalid params - TD$")
	public void CommandInvalidParams(){
		List<String> params = Arrays.asList("Manipulate", "test1.txt", "This is test one");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
	}
	
	@Given("command is given null params - TD$")
	public void CommandNullParams(){
		List<String> params = null;
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);
	}
	
	
	/* Manipulate File */
	
	@Given("Valid Manipulate File Params are given - TD$")
	public void ValidManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "DriverTest.txt", "This is test with driver");
		tb = new Toolbox(params);
		tb.cmd = new ManipulateSuccessStub(params);	
	}
	
	@Given("Giving Manipulate File empty Params - TD$")
	public void EmptyManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "", "");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	@Given("Giving Manipulate File null Params - TD$")
	public void NullManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", null, null);
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	/* Download File */
	
	@Given("Valid Download File Params are given - TD$")
	public void ValidDownload(){
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		tb = new Toolbox(params);
		tb.cmd = new DownloadSuccessStub(params);
	}
	
	@Given("Giving Download File invalid Params - TD$")
	public void InvalidDownload(){
		List<String> params = Arrays.asList("Download", "ThisIsAnInvalidPath", "test1.jpg");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	@Given("Giving Download File empty Params - TD$")
	public void EmptyDownloadFile(){
		List<String> params = Arrays.asList("Download", "", "");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	@Given("Giving Download File null Params - TD$")
	public void NullDownloadFile(){
		List<String> params = Arrays.asList("Download", null, null);
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	/* Email */
	
	@Given("Valid Email Params are given - TD$")
	public void ValidEmail(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		tb = new Toolbox(params);
		tb.cmd = new SendEmailSuccessStub(params);	
	}
	
	@Given("Giving Email empty Params - TD$")
	public void EmptyEmail(){
		List<String> params = Arrays.asList("Email", "", "", "", "");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	@Given("Giving Email missing Params - TD$")
	public void MissingEmail(){
		List<String> params = Arrays.asList("Email");
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	
	@Given("Giving Email null Params - TD$")
	public void NullEmail(){
		List<String> params = Arrays.asList("Email", null, null, null, null);
		tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);	
	}
	

	
}




