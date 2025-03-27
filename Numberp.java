public class Numberp {
    public static void main(String[] args) {
        int start = 5;
        
        for (int i = 0; i < 5; i++) {
            System.out.print(start + " ");
            if (i < 2) start--; // Decrease for first half
            else start++; // Increase for second half
        }
    }
}
