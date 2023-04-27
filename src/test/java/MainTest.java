import org.junit.jupiter.api.Test;
import org.wruthless.BinarySearch;
import org.wruthless.Main;
import org.wruthless.OnesComplement;
import org.wruthless.RotatedString;

import java.awt.*;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class MainTest {

    @Test
    public void printHelloWorld() {
        Main main = new Main();
        assertThat(main.helloWorld()).isEqualTo("Hello World");
    }


    @Test
    public void binSearchFour() {

        BinarySearch binarySearch = new BinarySearch();

        int[] arr = binarySearch.getArr();

        assertThat(BinarySearch.binSearch(arr, 848)).isEqualTo(4);

    }


    @Test
    public void onesComplementCorrect() {

        int input = 22;

        int onesVal = 9;

        String binStringVal = "1001";

        assertThat(OnesComplement.onesComplement(input)).isEqualTo(Arrays.asList(onesVal, binStringVal));

    }


    @Test
    public void rotatedStringTrue() {

        String strA = "abcdef";

        String strB = "cdefab";

        assertThat(RotatedString.rotatedString(strA, strB)).isEqualTo(true);

    }


    @Test
    public void rotatedStringFalse() {

        String strA = "abcdef";

        String strB = "cefabd";

        assertThat(RotatedString.rotatedString(strA, strB)).isEqualTo(false);
    }


}
