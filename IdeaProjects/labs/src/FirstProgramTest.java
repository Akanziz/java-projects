import static org.junit.jupiter.api.Assertions.*;

class FirstProgramTest {

    @org.junit.jupiter.api.Test
    void sumOfSquares() {
        assertAll(
                () -> assertEquals(2, FirstProgram.sumOfSquares(1, 1))
        );
    }
}
