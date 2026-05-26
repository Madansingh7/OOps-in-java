class PrimeThread extends Thread {

    int start, end;

    PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Same method called by all threads
    void generatePrime(int start, int end) {

        for (int i = start; i <= end; i++) {

            boolean prime = true;

            if (i <= 1) {
                prime = false;
            }

            for (int j = 2; j <= i/2; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }

    public void run() {
        generatePrime(start, end);
    }
}

public class PrimeNumbers {
    public static void main(String[] args) {

        PrimeThread t1 = new PrimeThread(1, 100);
        PrimeThread t2 = new PrimeThread(101, 200);
        PrimeThread t3 = new PrimeThread(201, 300);

        t1.start();
        t2.start();
        t3.start();
    }
}
