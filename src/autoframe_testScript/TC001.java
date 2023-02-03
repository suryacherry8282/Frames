package autoframe_testScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import autoframe_testdata.General;

public class TC001  {
	@Test
	public void tc001()throws Exception{
	
	DOMConfigurator.configure("log4j.xml");
//public static void main(String[] args) throws Exception {
	General gen=new General();
	gen.openApplication();
	gen.loginApplication();
	gen.logoutApplication();
	gen.amazonopen();
	gen.flipkartOpen();
	gen.closeApplication();
	
}
}
