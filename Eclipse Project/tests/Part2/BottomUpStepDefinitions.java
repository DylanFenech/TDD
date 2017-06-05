package Part2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import Part1.Command;
import Part1.CommandFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BottomUpStepDefinitions {



Command cmd = null;
	
	/* Command usage */
	
	@When("^the command is executed$")
	public void ExecuteCommand()
	{
		cmd.run();
	}
	
	@Then("^the command result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, cmd.result);
	}
	
	/* Generic Command */
	
	@Given("command is given invalid params$")
	public void CommandInvalidParams(){
		List<String> params = Arrays.asList("InvalidCommand");
		new CommandFactory(); // to test instantiation of CF
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("command is given null params$")
	public void CommandNullParams(){
		List<String> params = null;
		new CommandFactory(); // to test instantiation of CF
		cmd = CommandFactory.parseCommand(params);
	}
	
	
	/* Manipulate File */
	
	@Given("Valid Manipulate File Params are given$")
	public void ValidManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "DriverTest.txt", "This is test with driver");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Manipulate File empty Params$")
	public void EmptyManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", "", "");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Manipulate File null Params$")
	public void NullManipulateFile(){
		List<String> params = Arrays.asList("Manipulate", null, null);
		cmd = CommandFactory.parseCommand(params);
	}
	
	/* Download File */
	
	@Given("Valid Download File Params are given$")
	public void ValidDownload(){
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Download File empty Params$")
	public void EmptyDownloadFile(){
		List<String> params = Arrays.asList("Download", "", "");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Download File null Params$")
	public void NullDownloadFile(){
		List<String> params = Arrays.asList("Download", null, null);
		cmd = CommandFactory.parseCommand(params);
	}
	
	/* Email */
	
	@Given("Valid Email Params are given$")
	public void ValidEmail(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Email empty Params$")
	public void EmptyEmail(){
		List<String> params = Arrays.asList("Email", "", "", "", "");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Email missing Params$")
	public void MissingEmail(){
		List<String> params = Arrays.asList("Email");
		cmd = CommandFactory.parseCommand(params);
	}
	
	@Given("Giving Email null Params$")
	public void NullEmail(){
		List<String> params = Arrays.asList("Email", null, null);
		cmd = CommandFactory.parseCommand(params);
	}
	

	
}




