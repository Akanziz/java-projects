import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {
    @Test
    void add() {
        int[][] input1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] input2 = {{7, 8, 9}, {10, 11, 12}};

        Matrix m1 = new Matrix(2, 3, input1);
        Matrix m2 = new Matrix(2, 3, input2);

        m1.add(m2);
        assertEquals("8 10 12 \n14 16 18 \n", m1.toString());

        int[][] input3 = {{}, {}};
        int[][] input4 = {{}, {}};

        Matrix m3 = new Matrix(0, 0, input3);
        Matrix m4 = new Matrix(0, 0, input4);

        m3.add(m4);
        assertEquals("", m3.toString());

        int[][] input5 = {{18}, {88}};
        int[][] input6 = {{100}, {40}};

        Matrix m5 = new Matrix(1, 1, input5);
        Matrix m6 = new Matrix(1, 1, input6);

        m5.add(m6);
        assertEquals("118 \n", m5.toString());
    }

    @Test
    void multiply() {
        int[][] input1 = {{1, 2}, {3, 4}};
        int[][] input2 = {{5, 6}, {7, 8}};

        Matrix m1 = new Matrix(2, 2, input1);
        Matrix m2 = new Matrix(2, 2, input2);

        m1.multiply(m2);
        assertEquals("19 22 \n43 50 \n", m1.toString());

        int[][] input3 = {{1, 2}, {3, 4}};
        int[][] input4 = {{5, 6}, {7, 8}};

        Matrix m3 = new Matrix(2, 2, input3);
        Matrix m4 = new Matrix(2, 2, input4);

        m3.multiply(m4);
        assertEquals("19 22 \n43 50 \n", m3.toString());
    }

    @Test
    void transpose() {
    }

    @Test
    void rotate() {
    }

    @Test
    void testToString() {
    }
}
