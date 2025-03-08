class Matrix {

    /**
     * Define the variables that will be called later in the function
     * Define a new array
     * The rows is the number of rows in matrix
     * the columns is the number of columns in the matrix
     */
    private int[][] Matrix;
    private int rows;
    private int columns;


    /**
     * Getter for the private Array
     * @return the Array Matrix
     */
    public int[][] getMatrix() {
        return Matrix;
    }

    /**
     * getter for the rows private variable
     * @return the number of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * getter for the columns private variable
     * @return the number of columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Create a Constructor that receives two integers representing the number of rows and columns respectively
     * Also define a new two-dimensional array of integers and copy integers
     * Initialize m and n with the rows and columns
     * Use two for loops in order to copy data from given array to matrix
     * initialize the numbers to their correct spot using this.
     * @param m is the number of rows
     * @param n is the number of columns
     * @param firstArray is the new two-dimensional array
     */
    public Matrix (int m, int n, int[][] firstArray) {
        this.rows = m;
        this.columns = n;
        this.Matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.Matrix[i][j] = firstArray[i][j];
            }
        }
    }

    /**
     * Design a set method that sets the value at row i and column j to val
     * use an if statement checking to make sure that i and j are within the bounds that they need to be
     * then set i and j in the finalArray to the val variable
     * @param i is set to row
     * @param j is set to column
     * @param val is what we are setting i and j to
     */
    public void set(int i, int j, int val) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            Matrix[i][j] = val;
        }
    }

    /**
     * Design an add method that adds the values of the passed matrix to the current matrix
     * Use an if statement to make sure that the rows and columns match
     * Use a for loop in a for loop in order to search through both the rows and columns
     * finally add the elements to their correct locations
     * @param m is the matrix that will be added to the other matrix
     */
    public void add(Matrix m) {
        if (m.rows == rows && m.columns == columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Matrix[i][j] += m.Matrix[i][j];
                }
            }
        }
    }

    /**
     * Design a method that multiplies the values of the passed matrix to the current matrix
     * Use an if statement to make sure columns = rows or in other words, the two can be multiplied
     * If so, define a new array with the result array dimensions
     * Use a triple for loop in order to search through each row, column, and each element in the row
     * Then do the multiplication of the array and add it to the array most recently defined
     * update the finalArray and update the number of columns variable
     * @param m is the new matrix that will be multiplied to the other matrix
     */
    public void multiply (Matrix m) {
        if (columns == m.rows) {
            int[][] last = new int[rows][m.columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < m.columns; j++) {
                    for (int z = 0; z < columns; z++) {
                        last[i][j] += Matrix[i][z] * m.Matrix[z][j];
                    }
                }
            }

            Matrix = last;
            columns = m.columns;
        }
    }

    /**
     * Design a method that transposes the matrix
     * In other words the rows become columns and the columns become rows
     * Define a new array with the correct dimensions that are needed
     * Construct a double for loop in order to swap the rows and the columns
     * make the new array equal to what the positions in the old array would be
     * Outside the for loop, update the final array with the array that was most previously defined
     * Define a temp variable that can be used to swap rows and columns and set it equal to rows
     * make rows equal to columns
     * then make columns equal to the temp variable
     */
    public void transpose() {
        int[][] last = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                last[j][i] = Matrix[i][j];
            }
        }

        Matrix = last;
        int tempRows = rows;
        rows = columns;
        columns = tempRows;
    }

    /**
     * Design a method that rotates the matrix 90 degrees clockwise
     * Start by transposing the matrix
     * Use a double for loop in order to reverse the rows to complete the rotation
     * Use a bubble sort method to complete the problem
     * make a temp variable that is equal to the final array designed at the top of the class
     * Set the final array = to the new dimensions then reset the temp variable
     */
    public void rotate() {
        transpose();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[i][columns - 1 - j];
                Matrix[i][columns - 1 - j] = temp;
            }
        }
    }

    /**
     * Design a method that prints out the matrix in a boxed format
     * Define a new string using StingBuilder in order to accomplish the task
     * Use a double for loop that iterates over the rows and the columns in the matrix
     * append the new string with the finalArray and its elements
     * append the string with a space after each element
     * finally add a new line after each row
     * @return a printed out matrix in a boxed format
     */
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                string.append(Matrix[i][j]);
                string.append("\t");
            }

            string.append("\n");
        }

        return string.toString();
    }
}


