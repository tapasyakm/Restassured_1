package RestTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class junit {
	@Before
	public void BT()
	{
		String Name = "Sunil";
		String SName = "Nishchith";
		Assert.assertEquals(SName, Name);
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is my first teestcase1");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("This is After test");
	}
}
