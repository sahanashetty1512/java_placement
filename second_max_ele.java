import java.util.Scanner;

public class second_Max_ele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements to find the second maximum.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondMax = findSecondMax(arr);

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum element is: " + secondMax);
        } else {
            System.out.println("No second maximum element exists.");
        }

        scanner.close();
    }

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE ? Integer.MIN_VALUE : secondMax;
    }
}
