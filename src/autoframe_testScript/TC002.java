package autoframe_testScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import autoframe_testdata.General;

public class TC002 {
 @Test
 public void tc002() {
	 DOMConfigurator.configure("log4j.xml");
	General obj=new General() ;
	obj.flipkartOpen();
	obj.closeApplication();
 }
}
