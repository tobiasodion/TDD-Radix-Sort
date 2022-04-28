package Test;

import org.junit.Test;
import static org.junit.Assert.*;

import static RS.Utility.*;

public class UtilityTest {
    @Test
    public void utility_maxNumberGetRightMax(){
        int[] testArray = {2,40,40,20,30,35};
        assertEquals(40, getMax(testArray, testArray.length));
    }
}
