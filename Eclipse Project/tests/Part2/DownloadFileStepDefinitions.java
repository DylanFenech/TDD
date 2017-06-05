package Part2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import Part1.Toolbox;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DownloadFileStepDefinitions {

Toolbox tb = null;
		
	@When("^download is executed$")
	public void ExecuteCommand()
	{
		tb.execCommand();
	}
	
	@Then("^download result should be (.*)$")
	public void AssertCorrectResult(String result) {
		
		Boolean r = Boolean.parseBoolean(result);
		
		assertEquals("Returns ",r, tb.getCommandOutcome());
	}

	/* Download File */
	
	@Given("^download valid$")
	public void ValidDownloadFile(){
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		tb = new Toolbox(params);
	}
	
	@Given("^download empty params$")
	public void EmptyDownloadFile(){
		List<String> params = Arrays.asList("Download", "", "");
		tb = new Toolbox(params);
	}
	
	@Given("^download null params$")
	public void NullDownloadFile(){
		List<String> params = Arrays.asList("Download", null, null);
		tb = new Toolbox(params);
	}
	
	@Given("^download missing params$")
	public void MissingDownloadFile(){
		List<String> params = Arrays.asList("Download");
		tb = new Toolbox(params);
	}
	
	@Given("^download empty url$")
	public void EmptyDownloadFileName(){
		List<String> params = Arrays.asList("Download", "", "MyImage.jpg");
		tb = new Toolbox(params);
	}
	
	
	
}