import java.util.Scanner;

class GenericSort {

    // Generic Sort Method
    public static <T extends Comparable<T>> void sort(T arr[]) {

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

    // Generic Display Method
    public static <T> void display(T arr[]) {

        for(T element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Integer Sorting");
        System.out.println("2. String Sorting");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if(choice == 1) {

            Integer num[] = new Integer[5];

            System.out.println("Enter 5 Integer Values:");

            for(int i = 0; i < 5; i++) {
                num[i] = sc.nextInt();
            }

            System.out.println("\nBefore Sorting:");
            display(num);

            sort(num);

            System.out.println("After Sorting:");
            display(num);

        }

        else if(choice == 2) {

            String names[] = new String[5];

            System.out.println("Enter 5 Names:");

            for(int i = 0; i < 5; i++) {
                names[i] = sc.next();
            }

            System.out.println("\nBefore Sorting:");
            display(names);

            sort(names);

            System.out.println("After Sorting:");
            display(names);
        }

        else {
            System.out.println("Invalid Choice");
        }
    }
}
