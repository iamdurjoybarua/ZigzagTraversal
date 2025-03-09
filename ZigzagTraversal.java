public class ZigzagTraversal {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Zigzag Traversal:");
        zigzagTraverse(matrix);
    }

    // Method to traverse a 2D array in a zigzag pattern
    public static void zigzagTraverse(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty.");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = 0;
        boolean goingDown = true; // Flag to determine traversal direction

        // Loop until all elements are traversed
        for (int i = 0; i < rows * cols; i++) {
            System.out.print(matrix[row][col] + " ");

            if (goingDown) { // Traversal going down-left
                if (row == rows - 1) { // Reached bottom row
                    col++; // Move right
                    goingDown = false; // Change direction to up-right
                } else if (col == 0) { // Reached left column
                    row++; // Move down
                    goingDown = false; // Change direction to up-right
                } else { // Move diagonally down-left
                    row++;
                    col--;
                }
            } else { // Traversal going up-right
                if (col == cols - 1) { // Reached right column
                    row++; // Move down
                    goingDown = true; // Change direction to down-left
                } else if (row == 0) { // Reached top row
                    col++; // Move right
                    goingDown = true; // Change direction to down-left
                } else { // Move diagonally up-right
                    row--;
                    col++;
                }
            }
        }
        System.out.println(); // Add a newline after printing
    }
}