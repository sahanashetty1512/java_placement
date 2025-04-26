import java.util.Scanner;

public class min_ele_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Array should have at least one element.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minIndex = findMinIndex(arr);

        System.out.println("The index of the minimum element is: " + minIndex);

        scanner.close();
    }

    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
