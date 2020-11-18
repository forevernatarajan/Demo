package Junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Execute {
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(Employee.class,JunitTest.class);
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getFailureCount());
		List<Failure> fail=r.getFailures();
		for(Failure x:fail)
		{
			System.out.println(x);
		}
	}

}
