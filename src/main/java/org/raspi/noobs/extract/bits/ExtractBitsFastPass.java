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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a <epsilonagentx at gmail.com>.
 */
public class ExtractBitsFastPass implements ExtractBits {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtractBitsFastPass.class);
    private static final int LIMIT = 1;

    public ExtractBitsFastPass() {
        LOGGER.debug("ExtractBitsFastPass c:tor");
    }

    /**
     * Add some comments here.
     *
     * @param inputNumber
     */
    @Override
    public List<Long> summationOfSetBits(long inputNumber) {
        long extractedNumber;
        List<Long> longList = new ArrayList<>();
        if (inputNumber < LIMIT) {
            LOGGER.debug("The input number {} is below the Limit {}", inputNumber, LIMIT);
            return longList;
        }
        int count = 0;
        while (inputNumber != 0) {
            extractedNumber = inputNumber;
            inputNumber &= (inputNumber - 1);
            extractedNumber ^= inputNumber;

            count++;
            longList.add(extractedNumber);
        }
        LOGGER.debug("The iterations on the fast pass are {}", count);
        return longList;
    }
}
