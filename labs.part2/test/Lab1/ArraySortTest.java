/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class ArraySortTest {
    
    @Test
    public void testLess() {
        
        assertEquals(ArraySort.less(1, 3), true);
        assertEquals(ArraySort.less(-1, 1), true);
        assertEquals(ArraySort.less(1, -1), false);
        assertEquals(ArraySort.less(-1, -3), false);
    }
    
    @Test
    public void testExch() {

        double[] testArr = { 1.0, 2.0, 3.0, 4.0 };
        double[] result = new double[4];

        ArraySort.exch(testArr, 0, 1);
        assertEquals(testArr[0], 2.0, 0);
        assertEquals(testArr[1], 1.0, 0);

        ArraySort.exch(testArr, 3, 2);
        assertEquals(testArr[3], 3.0, 0);
        assertEquals(testArr[2], 4.0, 0);
    }
    
    @Test
    public void testCompExch() {

        double[] testArr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        double[] result = new double[4];

        ArraySort.compExch(testArr, 0, 3);
        assertEquals(testArr[0], 1.0, 0);
        assertEquals(testArr[3], 4.0, 0);

        ArraySort.compExch(testArr, 5, 8);
        assertEquals(testArr[5], 1.0, 0);
        assertEquals(testArr[8], 4.0, 0);
    }
    
    @Test
    public void testSort() {
        double[] case_1 = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        double[] case_2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double[] case_3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        
        ArraySort.sort(case_1, 0, case_1.length - 1);
        assertTrue(Arrays.equals(case_1, case_2));
        
        ArraySort.sort(case_2, 0, case_2.length - 1);
        assertTrue(Arrays.equals(case_2, case_1));
        
        ArraySort.sort(case_3, 0, case_3.length - 1);
        assertTrue(Arrays.equals(case_3, case_2));
    }
}
