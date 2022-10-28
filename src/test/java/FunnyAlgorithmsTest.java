import static org.junit.Assert.*;
import org.junit.*;
import Application.FunnyAlgorithms;

public class FunnyAlgorithmsTest {
	
	private FunnyAlgorithms f = new FunnyAlgorithms();
		
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@After
	public void afterTest() {
		System.out.println("after test");
	}
	
	@Test
	public void numberTest() {
		System.out.println("Test with number 123");
		assertEquals(123, f.stringToIntConverter("123"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void numberInRangeTest() {
		System.out.println("Test of number in range [-32768, 32767]");
		f.stringToIntConverter("32768");
	}
}
