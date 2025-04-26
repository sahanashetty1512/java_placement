import java.util.Scanner;

public class second_Min_ele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements to find the second minimum.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondMin = findSecondMin(arr);

        if (secondMin != Integer.MAX_VALUE) {
            System.out.println("The second minimum element is: " + secondMin);
        } else {
            System.out.println("No second minimum element exists.");
        }

        scanner.close();
    }

    public static int findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }

        return secondMin == Integer.MAX_VALUE ? Integer.MAX_VALUE : secondMin;
    }
}
