import java.util.Scanner;

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

        for (int k = 0; k < B.length; k++) {

            C[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Input rows and columns for Matrix A
            System.out.print("Enter rows of Matrix A: ");
            int r1 = sc.nextInt();

            System.out.print("Enter columns of Matrix A: ");
            int c1 = sc.nextInt();

            // Input rows and columns for Matrix B
            System.out.print("Enter rows of Matrix B: ");
            int r2 = sc.nextInt();

            System.out.print("Enter columns of Matrix B: ");
            int c2 = sc.nextInt();

            // Check multiplication condition
            if (c1 != r2) {

                System.out.println("Matrix multiplication not possible");
                return;
            }

            int A[][] = new int[r1][c1];
            int B[][] = new int[r2][c2];
            int C[][] = new int[r1][c2];

            // Input Matrix A
            System.out.println("Enter elements of Matrix A:");

            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c1; j++) {

                    A[i][j] = sc.nextInt();
                }
            }

            // Input Matrix B
            System.out.println("Enter elements of Matrix B:");

            for (int i = 0; i < r2; i++) {

                for (int j = 0; j < c2; j++) {

                    B[i][j] = sc.nextInt();
                }
            }

            MultiplyThread threads[][] = new MultiplyThread[r1][c2];

            // Create and start threads
            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++) {

                    threads[i][j] = new MultiplyThread(A, B, C, i, j);

                    threads[i][j].start();
                }
            }

            // Wait for all threads to finish
            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++) {

                    threads[i][j].join();
                }
            }

            // Display Result Matrix
            System.out.println("Result Matrix:");

            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++) {

                    System.out.print(C[i][j] + " ");
                }

                System.out.println();
            }
        }

        catch (Exception e) {

            System.out.println("Error occurred");
        }

        sc.close();
    }
}
