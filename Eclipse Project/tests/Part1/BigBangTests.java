package Part1;

import java.util.Arrays;
import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

public class BigBangTests {

	@Test
	public void testFile() {
		List<String> params = Arrays.asList("Manipulate", "test1.txt", "This is test one");
		Toolbox tb = new Toolbox(params);
		tb.execCommand();
		assertTrue("Text file test",tb.getCommandOutcome());
	}
	
	@Test
	public void testImage() {
		List<String> params = Arrays.asList("Download", "https://moodle.org/pluginfile.php/135/mod_forum/post/1351939/codeproduction.jpg", "test1.jpg");
		Toolbox tb = new Toolbox(params);
		tb.execCommand();
		assertTrue("Image Download Test",tb.getCommandOutcome());
	}

	@Test
	public void testEmail(){
		List<String> params = Arrays.asList("Email", "iamnottestedbutdriven@gmail.com", "berawdu@gmail.com", "Hello ma fwend", "Xanna buddy?");
		Toolbox tb = new Toolbox(params);
		tb.execCommand();
		assertTrue("Email Test",tb.getCommandOutcome());
	}
}
