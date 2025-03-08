import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void circleArea() {
        assertAll(
                () -> assertEquals(0, Problem8.circleArea(0,0)),
                () -> assertEquals(373.20508075688775, Problem8.circleArea(10, 5)),
                () -> assertEquals(15798.109969693458, Problem8.circleArea(65, 23))
        );
    }
}