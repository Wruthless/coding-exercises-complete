package org.wruthless;

import java.util.Arrays;
import java.util.List;

public class OnesComplement {

    public static List<Object> onesComplement(int n) {

        int numOfBits = (int) Math.floor(Math.log(n) / Math.log(2)) + 1;

        int ones = ( ( 1 << numOfBits ) - 1 ) ^ n;

        String binString = Integer.toBinaryString(ones);

        return Arrays.asList(ones, binString);

    } // end onesComplement()


}
