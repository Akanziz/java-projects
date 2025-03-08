import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigNatTest {

    @Test
    void addtest() {
        BigNat bigNat1 = new BigNat("12345");
        BigNat bigNat2 = new BigNat("54321");
        bigNat1.add(bigNat2);
        assertEquals("66666", bigNat1.toString());

        BigNat bigNat3 = new BigNat("999");
        BigNat bigNat4 = new BigNat("1");
        bigNat3.add(bigNat4);
        assertEquals("1000", bigNat3.toString());
    }

    @Test
    void subtest() {
        BigNat bigNat1 = new BigNat("54321");
        BigNat bigNat2 = new BigNat("12345");
        bigNat1.sub(bigNat2);
        assertEquals("41976", bigNat1.toString());

        BigNat bigNat3 = new BigNat("1000");
        BigNat bigNat4 = new BigNat("1");
        bigNat3.sub(bigNat4);
        assertEquals("999", bigNat3.toString());
    }

    @Test
    void multest() {
        BigNat bigNat1 = new BigNat("123");
        BigNat bigNat2 = new BigNat("456");
        bigNat1.mul(bigNat2);
        assertEquals("56088", bigNat1.toString());

        BigNat bigNat3 = new BigNat("999");
        BigNat bigNat4 = new BigNat("123456789");
        bigNat3.mul(bigNat4);
        assertEquals("122333444565131", bigNat3.toString());
    }

    @Test
    void divtest() {
        BigNat bigNat1 = new BigNat("999");
        BigNat bigNat2 = new BigNat("123");
        bigNat1.div(bigNat2);
        assertEquals("8", bigNat1.toString());

        BigNat bigNat3 = new BigNat("123456789");
        BigNat bigNat4 = new BigNat("999");
        bigNat3.div(bigNat4);
        assertEquals("123456", bigNat3.toString());
    }
}
