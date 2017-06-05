package Part1;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class BottomUpTesting {
	
	@Test
	public void InvalidCommandPlaceHolderWithDriver(){
		List<String> params = Arrays.asList("InvalidCommand");
		new CommandFactory(); // to test instantiation of CF
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Invalid Command", cmd.result);
	}
	
	@Test
	public void InvalidCommandNullParams(){
		List<String> params = null;
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Invalid Command - NULL Params", cmd.result);
	}

	@Test
	public void FileWithDriverValid() {
		List<String> params = Arrays.asList("Manipulate", "DriverTest.txt", "This is test with driver");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertTrue("Text File with Driver - Valid", cmd.result);
	}
	
	@Test
	public void FileWithDriverEmptyParams() {
		List<String> params = Arrays.asList("Manipulate", "", "");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Text File with Driver - Empty Params", cmd.result);
	}
	
	@Test
	public void FileWithDriverNullParams() {
		List<String> params = Arrays.asList("Manipulate", null, null);
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Text File with Driver - NULL Params",cmd.result);
	}
	
	@Test
	public void DownloadWithDriverValid() {
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertTrue("Download with Driver - Valid", cmd.result);	
	}
	
	@Test
	public void DownloadWithDriverInvalid() {
		List<String> params = Arrays.asList("Download", "ThisIsAnInvalidPath", "test1.jpg");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Download with Driver - Invalid URL", cmd.result);	
	}
	
	@Test
	public void DownloadWithDriverEmptyParams() {
		List<String> params = Arrays.asList("Download", "", "");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Download with Driver - Empty Params", cmd.result);	
	}
	
	@Test
	public void DownloadWithDriverNullParams() {
		List<String> params = Arrays.asList("Download", null, null);
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Download with Driver - NULL Params", cmd.result);	
	}
	
	@Test
	public void EmailWithDriverValid(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertTrue("Email with Driver - Valid", cmd.result);
	}

	@Test
	public void EmailWithDriverEmptyParams(){
		List<String> params = Arrays.asList("Email", "", "", "", "");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Email with Driver - Empty Params", cmd.result);
	}
	
	@Test
	public void EmailWithDriverMissingParams(){
		List<String> params = Arrays.asList("Email");
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Email with Driver - Empty Params", cmd.result);
	}
	
	@Test
	public void EmailWithDriverNullParams(){
		List<String> params = Arrays.asList("Email", null, null, null, null);
		Command cmd = CommandFactory.parseCommand(params);
		cmd.run();
		assertFalse("Email with Driver - NULL Params", cmd.result);
	}
	
}
