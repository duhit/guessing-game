package org.cloudwick.game;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	BinarySearchGame binaryObj;
	@Before
	  public void setUp() throws Exception {
		binaryObj = new BinarySearchGame();
    }
	
	@Test
    public void shouldReturnFalseIfArrayIsEmpty() {
        assertEquals(false, binaryObj.find(new int[] {}, 1));
    }
 
    @Test
    public void shouldReturnFalseIfNotFoundInSortedOddArray() {
        assertEquals(false,
        		binaryObj.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9));
    }
}
