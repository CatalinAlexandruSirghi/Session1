import org.example.ContainsDuplicate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ContainsDuplicateTest {
   
    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        boolean result = ContainsDuplicate.containsDuplicate(emptyArray);

        assertFalse(result);
    }

    @Test
    public void testOneElementArray() {

        int[] oneElemenetArray = {1};
        boolean result = ContainsDuplicate.containsDuplicate(oneElemenetArray);
        assertFalse(result);
    }

    @Test
    public void testOnlyOneDuplicate() {
        int[] oneDuplicateArray = {1, 2, 1, 4, 5};
        boolean result = ContainsDuplicate.containsDuplicate(oneDuplicateArray);
        assertTrue(result);
    }

    @Test
    public void testMultipleDuplicates() {
        int[] multipleDuplicateArray = {1,1,2,2};
        boolean result = ContainsDuplicate.containsDuplicate(multipleDuplicateArray);

        assertTrue(result);

    }


}
