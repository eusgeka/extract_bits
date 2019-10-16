package org.raspi.noobs.extract.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a developer.
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
