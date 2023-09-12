package BasicTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeTest
	public void beforeTest() {
		System.out.println("  beforetest 1");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("  before method 1");
	}

	@Test
	public void test() {
		System.out.println(" this is main test");
	}

	@Test
	public void test1() {
		System.out.println(" this is test 1");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("  after method 1");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("  aftertest 1");
}
}
