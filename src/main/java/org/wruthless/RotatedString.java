package org.wruthless;

public class RotatedString {

    public static boolean rotatedString(String string1, String string2) {

        String concat = string1 + string1;
        return concat.contains(string2);

    } // end rotatedString()


} // end RotatedString{}
