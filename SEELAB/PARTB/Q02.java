class MultiplyThread extends Thread {

    int row, col;
    int A[][];
    int B[][];
    int C[][];

    MultiplyThread(int A[][], int B[][], int C[][], int row, int col) {

        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
    }

    public void run() {

        C[row][col] = 0;

        for(int k = 0; k < B.length; k++) {

            C[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MatrixMultiplication {

    public static void main(String[] args) {

        try {

            int A[][] = {
                {1, 2},
                {3, 4}
            };

            int B[][] = {
                {5, 6},
                {7, 8}
            };

            int rows = A.length;
            int cols = B[0].length;

            int C[][] = new int[rows][cols];

            MultiplyThread threads[][] = new MultiplyThread[rows][cols];

            // Create threads
            for(int i = 0; i < rows; i++) {

                for(int j = 0; j < cols; j++) {

                    threads[i][j] = new MultiplyThread(A, B, C, i, j);

                    threads[i][j].start();
                }
            }

            // Wait for threads
            for(int i = 0; i < rows; i++) {

                for(int j = 0; j < cols; j++) {

                    threads[i][j].join();
                }
            }

            // Display Result
            System.out.println("Result Matrix:");

            for(int i = 0; i < rows; i++) {

                for(int j = 0; j < cols; j++) {

                    System.out.print(C[i][j] + " ");
                }

                System.out.println();
            }
        }

        catch(Exception e) {

            System.out.println("Error occurred");
        }
    }
}
