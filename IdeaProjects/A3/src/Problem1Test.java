import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        String[] expectedOutput = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz"};
        assertArrayEquals(expectedOutput, Problem1.fizzBuzz(1, 12));

        String[] expectedOutput2 = {"FizzBuzz", "16", "17", "Fizz"};
        assertArrayEquals(expectedOutput2, Problem1.fizzBuzz(15, 18));
    }
}