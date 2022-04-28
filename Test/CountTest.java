package Test;

import org.junit.Test;
import static org.junit.Assert.*;

import static RS.Count.*;

public class CountTest {

    @Test
    public void count_countUnitDigitOccurenceReturnsAccurateCount(){
        int[] testArray = new int[]{40,60,42,52,33,84,95,46,46,46,47,29};
        int[] count = countDigitOccurence(testArray, testArray.length, 1);

        assertEquals(2, count[0]);
        assertEquals(0, count[1]);
        assertEquals(2, count[2]);
        assertEquals(1, count[3]);
        assertEquals(1, count[4]);
        assertEquals(1, count[5]);
        assertEquals(3, count[6]);
        assertEquals(1, count[7]);
        assertEquals(0, count[8]);
        assertEquals(1, count[9]);
    }

    @Test
    public void count_countTenthDigitOccurenceReturnsAccurateCount(){
        int[] testArray = new int[]{40,60,42,52,33,84,95,46,46,46,47,29};
        int[] count = countDigitOccurence(testArray, testArray.length, 10);

        assertEquals(0, count[0]);
        assertEquals(0, count[1]);
        assertEquals(1, count[2]);
        assertEquals(6, count[4]);
        assertEquals(1, count[5]);
        assertEquals(1, count[6]);
        assertEquals(0, count[7]);
        assertEquals(1, count[8]);
        assertEquals(1, count[9]);
    }

    @Test
    public void count_countSortAccuracy() {
        int[] testArray = new int[]{4, 6, 4, 5, 3, 8, 9, 4, 4, 4, 4, 2};
        int[] count = countDigitOccurence(testArray, testArray.length, 1);
        int[] testResult = getSortResult(testArray, count, testArray.length, 1);

        for(int i = 0; i<testResult.length - 1; i++){
            assertEquals(true, testResult[i] <= testResult[i+1]);
        }
    }
}