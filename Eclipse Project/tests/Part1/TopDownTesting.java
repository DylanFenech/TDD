package Part1;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class TopDownTesting {
	
	@Test
	public void InvalidCommandPlaceHolderWithStub(){
		List<String> params = Arrays.asList("Manipulate", "test1.txt", "This is test one");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();

		assertFalse("Stub - Invalid Command - Placeholder", tb.getCommandOutcome());
	}
	
	@Test
	public void InvalidCommandNullParamsWithStub(){
		List<String> params = null;
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Invalid Command - NULL Params", tb.getCommandOutcome());
	}

	@Test
	public void FileWithStubValid() {
		List<String> params = Arrays.asList("Manipulate", "DriverTest.txt", "This is test with driver");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new ManipulateSuccessStub(params);		
		tb.execCommand();
		
		assertTrue("Stub - Text File - Valid", tb.getCommandOutcome());
	}
	
	@Test
	public void FileWithStubEmptyParams() {
		List<String> params = Arrays.asList("Manipulate", "", "");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Text File - Empty Params", tb.getCommandOutcome());
	}
	
	@Test
	public void FileWithStubNullParams() {
		List<String> params = Arrays.asList("Manipulate", null, null);
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Text File - NULL Params",tb.getCommandOutcome());
	}
	
	@Test
	public void DownloadWithStubValid() {
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new DownloadSuccessStub(params);		
		tb.execCommand();
		
		assertTrue("Stub - Download - Valid", tb.getCommandOutcome());	
	}
	
	@Test
	public void DownloadWithStubInvalid() {
		List<String> params = Arrays.asList("Download", "ThisIsAnInvalidPath", "test1.jpg");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Download with Driver - Invalid URL", tb.getCommandOutcome());	
	}
	
	@Test
	public void DownloadWithStubEmptyParams() {
		List<String> params = Arrays.asList("Download", "", "");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Download - Empty Params", tb.getCommandOutcome());	
	}
	
	@Test
	public void DownloadWithStubNullParams() {
		List<String> params = Arrays.asList("Download", null, null);
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Download - NULL Params", tb.getCommandOutcome());	
	}
	
	@Test
	public void EmailWithStubValid(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new SendEmailSuccessStub(params);		
		tb.execCommand();
		
		assertTrue("Stub - Email - Valid", tb.getCommandOutcome());
	}

	@Test
	public void EmailWithStubEmptyParams(){
		List<String> params = Arrays.asList("Email", "", "", "", "");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Email - Empty Params", tb.getCommandOutcome());
	}
	
	@Test
	public void EmailWithStubMissingParams(){
		List<String> params = Arrays.asList("Email");
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Email - Empty Params", tb.getCommandOutcome());
	}
	
	@Test
	public void EmailWithStubNullParams(){
		List<String> params = Arrays.asList("Email", null, null, null, null);
		Toolbox tb = new Toolbox(params);
		tb.cmd = new FailCommandStub(params);		
		tb.execCommand();
		
		assertFalse("Stub - Email - NULL Params", tb.getCommandOutcome());
	}
	
}
