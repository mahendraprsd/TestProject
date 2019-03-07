package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunnerClass {

	public static void main(String[] args) 
	{
		
		TestNG runner = new TestNG();
		
        List list = new ArrayList();
        
        list.add("D:\\Workspace\\Appium\\test-output\\SmokeTestScenarios\\testng-failed.xml");
	
        runner.setTestSuites(list);
        
        runner.run();
	}

}
