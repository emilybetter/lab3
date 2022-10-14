import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlace2() {
    int[] input1 = {2,4,6,8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{8, 6, 4, 2 }, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1,1, 2,3};
    assertEquals((1+2+3)/3, ArrayExamples.averageWithoutLowest(input1), 0);

  }
}
