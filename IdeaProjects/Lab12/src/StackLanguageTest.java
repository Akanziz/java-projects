import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLanguageTest {

    @Test
    void interpret() {
        StackLanguage stackLanguage = new StackLanguage();
        stackLanguage.readFile("testInput.txt");
        double result = stackLanguage.interpret();
        assertEquals(13.0, result);
    }
}