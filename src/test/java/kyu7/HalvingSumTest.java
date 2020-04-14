package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HalvingSumTest {
    @Test
    public void test() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
        assertEquals(247,hs.halvingSum(127));
        assertEquals(15,hs.halvingSum(8));
    }
}
