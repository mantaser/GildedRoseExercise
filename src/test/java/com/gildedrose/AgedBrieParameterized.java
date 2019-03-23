package com.gildedrose;

import com.gildedrose.entities.AgedBrie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class AgedBrieParameterized {

    private AgedBrie agedBrie;
    private int expectedSellIn;
    private int expectedQuality;

    public AgedBrieParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.agedBrie = new AgedBrie(sellIn,quality);
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[] [] {
                {-5,0,-6,2},
                {1,0,0,1},
                {5,50,4,50},
                {-1,48,-2,50},
                {-2,49,-3,50},
                {-3,50,-4,50}
        });
    }

    @Test
    public void updateQuality_sellIn() {
        this.agedBrie.updateQuality();
        assertEquals(expectedSellIn, this.agedBrie.getSellIn(), 0);
    }

    @Test
    public void updateQuality_quality() {
        this.agedBrie.updateQuality();
        assertEquals(expectedQuality, this.agedBrie.getQuality(), 0);
    }

}
