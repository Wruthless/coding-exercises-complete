import org.junit.jupiter.api.Test;
import org.wruthless.BinarySearch;
import org.wruthless.Main;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class MainTest {

    @Test
    public void printHelloWorld() {
        Main main = new Main();
        assertThat(main.helloWorld()).isEqualTo("Hello World");
    }

    @Test
    public void binSearchFour() {
        assertThat(BinarySearch.binSearchImpl()).isEqualTo(4);
    }

}
