/*
 * Copyright (C) 2019 Epsilon AgentX <epsilonagentx at gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.raspi.noobs.extract.bits;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtractBitsFastPassTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtractBitsFastPassTest.class);

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void summationOfSetBits() {
        LOGGER.info("summationOfSetBits");
        long testNumber = 88;
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(testNumber);
        assertFalse(longList.isEmpty());
        assertEquals(3, longList.size());
        assertEquals(8, longList.get(0).longValue());
        assertEquals(16, longList.get(1).longValue());
        assertEquals(64, longList.get(2).longValue());
    }

    @Test
    public void summationOfSetBitsLargeNumber() {
        LOGGER.info("summationOfSetBitsLargeNumber");
        long testNumber = 1073741824;
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(testNumber);
        assertFalse(longList.isEmpty());
        assertEquals(1, longList.size());
        assertEquals(1073741824, longList.get(0).longValue());
    }

    @Test
    public void summationOfSetBitsWithZero() {
        LOGGER.info("summationOfSetBitsWithZero");
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(0);
        assertTrue(longList.isEmpty());
    }

    @Test
    public void summationOfSetBitsWithNegative() {
        LOGGER.info("summationOfSetBitsWithNegative");
        ExtractBits interviewee = new ExtractBitsFastPass();
        List<Long> longList = interviewee.summationOfSetBits(-1);
        assertTrue(longList.isEmpty());
    }
}
