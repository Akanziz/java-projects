import java.util.InputMismatchException;

import static org.junit.Assert.assertThrows;

class EchoOddsTest {

    @org.junit.jupiter.api.Test
    void echoOdds() {
            assertThrows(InputMismatchException.class, () -> EchoOdds.echoOdds("test.in"));
        }
    }