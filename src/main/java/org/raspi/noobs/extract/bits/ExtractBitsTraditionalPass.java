package org.raspi.noobs.extract.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a developer.
 */
public class ExtractBitsTraditionalPass implements ExtractBits {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtractBitsTraditionalPass.class);

    private static final int BASE_OF_TWO = 2;
    private static final int ASCII_OF_ONE = 49;
    private static final int LIMIT = 1;

    public ExtractBitsTraditionalPass() {
        LOGGER.debug("ExtractBitsTraditionalPass c:tor");
    }

    /**
     * Add some comments here.
     *
     * @param inputNumber
     */
    public List<Long> summationOfSetBits(long inputNumber) {
        List<Long> longList = new ArrayList<>();
        if (inputNumber < LIMIT) {
            LOGGER.debug("The input number {} is below the Limit {}", inputNumber, LIMIT);
            return longList;
        }

        StringBuffer numberAsStringBuffer = new StringBuffer(Long.toBinaryString(inputNumber));

        int powerOf = 0;
        int howManyIterations = 0;

        for (int index = numberAsStringBuffer.length() - 1; index >= 0; index--) {
            int extractedNumber = Integer.valueOf(numberAsStringBuffer.charAt(index));
            if (extractedNumber == ASCII_OF_ONE) {
                long extractedLong = (long) Math.pow(BASE_OF_TWO, powerOf);
                longList.add(extractedLong);
            }
            howManyIterations++;
            powerOf++;
        }
        LOGGER.debug("The iterations on the traditionals pass are {}", howManyIterations);
        return longList;
    }
}
