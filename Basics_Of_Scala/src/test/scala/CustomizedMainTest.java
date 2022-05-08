import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class CustomizedMainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("customMain Test case")
    void customMain() {
        String[] actual = new String[0];
        assertDoesNotThrow(() -> CustomizedMain.customMain(actual));
    }

    @Test
    void main() {
        String[] actual = new String[0];
        assertDoesNotThrow(() -> CustomizedMain.main(actual));
    }

    @Test
    void intMain() {
        int[] actual = new int[0];
        assertDoesNotThrow(() -> CustomizedMain.intMain(actual));
    }
}