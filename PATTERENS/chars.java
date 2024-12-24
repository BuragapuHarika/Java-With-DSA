public class chars {
    public static void main(String args[]) {
        int ch = 'A';  // Initialize ch to the ASCII value of 'A' (65)
        int n = 4;      // Set the number of rows for the pattern to 4

        // outer loop (for lines)
        for (int line = 1; line <= n; line++) {
            // inner loop (for characters in each line)
            for (int chars = 1; chars <= line; chars++) {
                System.out.print((char) ch);  // Print the character corresponding to ch
                ch++;  // Increment ch to get the next character in the ASCII table
            }
            System.out.println();  // Move to the next line
        }
    }
}
