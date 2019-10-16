package org.raspi.noobs.extract.bits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtractBitsFastPassTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtractBitsFastPassTest.class);

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void summationOfSetBits() {
        LOGGER.info("summationOfSetBits");
        long testNumber = 88;
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(testNumber);
        Assert.assertFalse(longList.isEmpty());
        Assert.assertEquals(3, longList.size());
        Assert.assertEquals(8, longList.get(0).longValue());
        Assert.assertEquals(16, longList.get(1).longValue());
        Assert.assertEquals(64, longList.get(2).longValue());
    }

    @Test
    public void summationOfSetBitsLargeNumber() {
        LOGGER.info("summationOfSetBitsLargeNumber");
        long testNumber = 1073741824;
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(testNumber);
        Assert.assertFalse(longList.isEmpty());
        Assert.assertEquals(1, longList.size());
        Assert.assertEquals(1073741824, longList.get(0).longValue());
    }

    @Test
    public void summationOfSetBitsWithZero() {
        LOGGER.info("summationOfSetBitsWithZero");
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(0);
        Assert.assertTrue(longList.isEmpty());
    }

    @Test
    public void summationOfSetBitsWithNegative() {
        LOGGER.info("summationOfSetBitsWithNegative");
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(-1);
        Assert.assertTrue(longList.isEmpty());
    }
}
