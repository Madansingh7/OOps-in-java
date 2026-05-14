limport java.util.Scanner;

class BubbleSort<T extends Comparable<T>> {

    T arr[];

    // Constructor
    BubbleSort(T arr[]) {
        this.arr = arr;
    }

    // Generic Bubble Sort Method
    void sort() {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j].compareTo(arr[j + 1]) > 0) {

                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Display Method
    void display() {

        for(T i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer a[] = {45, 12, 67, 10, 5};

        BubbleSort<Integer> b = new BubbleSort<Integer>(a);

        System.out.println("Before Sorting:");

        b.display();

        b.sort();

        System.out.println("\nAfter Sorting:");

        b.display();
    }
}