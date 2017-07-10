import org.junit.Test;

import static org.junit.Assert.*;

public class IsArraySortedTests {
    private IsArraySorted isArraySorted = new IsArraySorted();
    private int[] mass = {34,67,-23,-56,23};
    private int[] mass1 = {3,5,78,89,8989,23232,3434343};
    private int[] mass2 = {-23,-21,-20,-18,-2};
    private int[] mass3 = {34,56,34,23,1111,23,34};
    private int[] mass4 = {-23,-6896,-34,-23,-1,-89};
    private int[] mass5 = {0,0,0,0,0,0,0};
    private int[] mass6 = {};
    private int[] mass7 = {5};

    @Test
    public void array_is_not_sorted() throws Exception {
        assertEquals(isArraySorted.isArraySorted(mass), "not sorted");
    }

    @Test
    public void array_positive_values_only_is_sorted() throws Exception{
        assertEquals(isArraySorted.isArraySorted(mass1), "sorted");
    }

    @Test
    public void array_negative_values_only_is_sorted() throws Exception{
        assertEquals(isArraySorted.isArraySorted(mass2), "sorted");
    }

    @Test
    public void array_only_positive_values_is_not_sorted() throws Exception{
        assertEquals("not sorted", isArraySorted.isArraySorted(mass3));
    }

    @Test
    public void array_only_negative_values_is_not_sorted() throws Exception{
        assertEquals("not sorted", isArraySorted.isArraySorted(mass4));
    }

    @Test
    public void array_only_zero_values() throws Exception{
        assertEquals("sorted", isArraySorted.isArraySorted(mass5));
    }

    @Test
    public void empty_array() throws Exception{
        assertEquals("Array is empty", isArraySorted.isArraySorted(mass6));
    }

    @Test
    public void array_with_one_value_only() throws Exception{
        assertEquals("sorted", isArraySorted.isArraySorted(mass7));
    }

}