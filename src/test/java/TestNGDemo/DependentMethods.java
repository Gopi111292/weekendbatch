package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;


public class DependentMethods {

	@Test(priority=1)
	void openapp()
	{
		AssertJUnit.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		AssertJUnit.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		AssertJUnit.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		AssertJUnit.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		AssertJUnit.assertTrue(true);
	}
	
}
