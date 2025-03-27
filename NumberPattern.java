public class NumberPattern {
    public static void main(String[] args) {
        int mid = 3; // Middle number of the pattern

        for (int i = 1; i <= 5; i++) {
            int num = (i <= 3) ? i : (6 - i); // Increasing till mid, then decreasing
            System.out.print(num + " ");
        }
    }
}

