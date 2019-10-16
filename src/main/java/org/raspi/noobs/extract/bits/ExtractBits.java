package org.raspi.noobs.extract.bits;

import java.util.List;

/**
 * Created by a developer.
 */
public interface ExtractBits {
    /**
     *
     * @param inputNumber
     * @return
     */
    List<Long> summationOfSetBits(long inputNumber);
}
