package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Hello implements IRetryAnalyzer {
	int minCount=1;
	int maxCount=5;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(minCount<maxCount)
		{
			minCount++;
			return true;
		}
		
		return false;
	}

}
