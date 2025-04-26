import java.util.Scanner;

public class max_ele_index {
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

        int maxIndex = findMaxIndex(arr);

        System.out.println("The index of the maximum element is: " + maxIndex);

        scanner.close();
    }

    public static int findMaxIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
