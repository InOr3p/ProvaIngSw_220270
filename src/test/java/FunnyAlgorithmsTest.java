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
	public void numberTest() {  // test 1
		System.out.println("Test with number 123");
		assertEquals(123, f.stringToIntConverter("123"));
	}
	
	@Test(expected = IllegalArgumentException.class)  // test 2
	public void numberInRangeTest() {
		System.out.println("Test of number in range [-32768, 32767]");
		f.stringToIntConverter("32768");
	}
	
	@Test(expected = IllegalArgumentException.class)  // test 3
	public void illegalNumberTest() {
		System.out.println("Test of illegal number (like A3, 2.3, 2 3, ...)");
		f.stringToIntConverter("A3");
	}
	
	@Test(expected = IllegalArgumentException.class)  // test 4
	public void illegalOrderTest() {
		int array[] = {1,2,3,4,5}; 
		System.out.println("Test of order != 0 and order != 1 in selection sort");
		f.selectionSort(array, 3);
	}
	
	@Test
	public void orderedArrayTest() {   // test 5
		int size = 6;
		int array[] =  {4,3,5,1,2,6};
		int orderedArray[] = {1,2,3,4,5,6}; 
		System.out.println("array [4,3,5,1,2,6] is ordered");
		f.selectionSort(array, 0);
		assertArrayEquals(orderedArray, array);
	}
}
