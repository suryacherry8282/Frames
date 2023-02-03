package autoframe_testScript;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import autoframe_testdata.General;

public class TC003 {
	@Test
	public  void tcc003() throws IOException {
		DOMConfigurator.configure("log4j.xml");
		General gen=new General();
		gen.openApplication();
		gen.CaptureScrren();
		gen.closeApplication();
	}
 
 
}
