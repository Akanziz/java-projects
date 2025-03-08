import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    public void hyperfactorialLoop() {
        assertEquals(1, Problem1.hyperfactorialLoop(0));
        assertEquals(1, Problem1.hyperfactorialLoop(1));
        assertEquals(86400000, Problem1.hyperfactorialLoop(5));
    }
}