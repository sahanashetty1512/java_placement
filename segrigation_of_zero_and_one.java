import java.util.Scanner;

public class Segrigation_Of_Zero_and_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (only 0's and 1's):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        segregate(arr);

        System.out.println("Array after segregation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void segregate(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            if (arr[low] == 0) {
                low++;
            } else if (arr[high] == 1) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }
}
