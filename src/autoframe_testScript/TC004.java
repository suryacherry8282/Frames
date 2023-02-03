package autoframe_testScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import autoframe_testdata.General;

public class TC004{
	@Test
	public void tc004() {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.droagOpen();
		obj.Enterfram();
		obj.Dragrop();
		obj.ExitFrame();
		obj.closeApplication();
		
		
	}

}
