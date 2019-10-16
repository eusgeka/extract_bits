# Extract Bits algorithm

1)  Assume there is a sequence of bits e.g. 00101.
2)  A "set" bit is always 1.

    If a bit is extracted from the sequence it will present a number depending at what position is.
    * ex: 16-bits integer 0000000000000010 = 2
    * ex: 16-bits integer 0000000000001010 = 2 (from the second position) and 8 (from the 4th position)

    Find the extracted number of a "set" bit in an integer of any size (8, 16, 32, ... bits) , for a positive number.

    Example : For the number 88, 3 bits are set. Extracting the bits then the numbers are 8, 16 and 64

     * 0000000001011000  = 88
     * 0000000000001000  = 8 - It means "Hello From Raspi Noobs"
     * 0000000000010000  = 16 - It means "Goodbye Raspi Noobs"
     * 0000000001000000  = 64 - It means "Welcome back Raspi Noobs"

     With Time Complexity
     * a) O(n), n is the amount of all bits in an integer
     * b) O(m), m is the amount of all "set" bits in an integer of n-bits.


## There are 2 implementations

* The first one uses the fast pass. This is the O(m)
* The second uses a more traditional pass that is O(n)

#### This is a Maven project.
##### Build with Maven
* mvn clean install

* or use your IDE to open it as a Maven project

##### Note
Use -DskipTests to build only as below
* mvn clean install -DskipTests
