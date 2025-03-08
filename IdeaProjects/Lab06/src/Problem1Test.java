
import java.util.LinkedList;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void toTreeSet() {
        assertAll(
                () -> assertEquals(new TreeSet<Double>(){{add(1.1); add(2.2); add(3.3);}},
                        Problem1.toTreeSet(new LinkedList<>(){{add(3.3); add(1.1); add(2.2);}})),
                () -> assertEquals(new TreeSet<Double>(){{add(5.5);}},
                        Problem1.toTreeSet(new LinkedList<>(){{add(7.7);}})),
                () -> assertEquals(new TreeSet<Double>(){{add(10.5); add(20.5); add(30.5);}},
                        Problem1.toTreeSet(new LinkedList<>(){{add(30.5); add(10.5); add(20.5);}}))


        );
    }
}