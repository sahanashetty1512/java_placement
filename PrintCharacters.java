public class PrintCharacters {
    public static void main(String[] args) {
        char ch = 'a'; // Starting character
        for (int i = 0; i < 5; i++) {
            System.out.print(ch + " ");
            ch++; 
            if (ch > 'd') { // Reset to 'a' after 'd'
                ch = 'a';
            }
        }
    }
}
