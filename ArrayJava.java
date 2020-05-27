import java.util.*;
public class ArrayJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("Array length is: " + arr.length);
        System.out.println("Sum = " + sum);

        int maximum = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[0] < arr[i]) {
                int temp = maximum;
                maximum = arr[i];
            }
        }
        System.out.println("Maximum = " + maximum);

        int minimum = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[0] > arr[i]) {
                int temp = minimum;
                minimum = arr[i];
            }
        }
        System.out.println("Minimum = " + minimum);

        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n The sorted array i descending order is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n The sorted array i ascending order is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.print(arr[i] + " ");
        }

            //Two Dimensional Array

            // initialize here.
            int row, col;
// enter row and column for array.
            System.out.println("\n Enter row for the array: ");
            row = sc.nextInt();
            System.out.println("Enter column for the array : ");
            col = sc.nextInt();

            int arrs[][] = new int[row][col];


            // enter array elements.
            System.out.println("Enter Array Elements : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arrs[i][j] = sc.nextInt();
                }
            }

            System.out.println("The Array is :\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arrs[i][j] + "  ");
                }
                System.out.println();
            }
        //System.out.println("Two-Dimensional Array length is: " + arrs.length);
    }
}


