public class SnakesandLadder {


        private int[][] board;
        private int rows;
        private int cols;

        public SnakesandLadder(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            this.board = new int[rows][cols];
            initializeBoard();
        }

        private void initializeBoard() {
            // You can populate the board with sequential numbers
            // or represent special squares (snakes/ladders) with specific values.
            // For example, -1 for snakes, positive numbers for ladders.
            int counter = 1;
            for (int i = 0; i < rows; i++) {
                // Alternate direction for rows for a typical Snakes and Ladders layout
                if (i % 2 == 0) { // Even rows (0, 2, 4...) fill left to right
                    for (int j = 0; j < cols; j++) {
                        board[i][j] = counter++;
                    }
                } else { // Odd rows (1, 3, 5...) fill right to left
                    for (int j = cols - 1; j >= 0; j--) {
                        board[i][j] = counter++;
                    }
                }
            }
            // Example: Add a ladder from 4 to 14
            // You would need a mapping from board number to 2D array index
            // For simplicity, this example just shows the concept.
            // board[row_of_4][col_of_4] = 14;
        }

        public int getSquareValue(int row, int col) {
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                return board[row][col];
            }
            return -1; // Indicate invalid coordinates
        }

        public void printBoard() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("%4d", board[i][j]);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            SnakesandLadder gameBoard = new SnakesandLadder(10, 10); // 10x10 board
            gameBoard.printBoard();
        }
    }

