import org.junit.Test;

import static org.junit.Assert.*;

public class CompareQuantityNegativeAndPositiveValuesTests {
    private CompareQuantityNegativeAndPositiveValues compareQuantityNegativeAndPositiveValues =
            new CompareQuantityNegativeAndPositiveValues();
    private int[] mass = {0,0,0,0,0,0,0};
    private int[] mass1 = {-1,-4,-6,-23,-233,-23333,-1};
    private int[] mass2 = {3,5,6,23,56,78,8888};
    private int[] mass3 = {-12,56,56,67666,-34,-67, -45, 67};
    private int[] mass4 = {};
    private int[] mass5 = {-4,-56,89,345,-567,-2398};
    private int[] mass6 = {34,56,-34,56,-87,-47,56,56,2323,-959595};

    @Test
    public void compare_quantity_only_zero_in_array() throws Exception {
            assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass), "only zeros in the array");
    }

    @Test
    public void compare_quantity_only_negative_in_the_array() throws Exception {
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass1), "negative");
    }

    @Test
    public void compare_quantity_only_positive_in_array() throws Exception {
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass2), "positive");
    }

    @Test
    public void compare_quantity_equals_pos_ang_neg() throws Exception {
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass3), "equals quantity");
    }

    @Test
    public void compare_qauntity_with_empty_array() throws Exception {
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass4), "Array is empty");
    }

    @Test
    public void compare_qauntity_more_negative(){
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass5), "negative");
    }

    @Test
    public void compare_qauntity_more_positive(){
        assertEquals(compareQuantityNegativeAndPositiveValues.compareQuantity(mass6), "positive");
    }

}