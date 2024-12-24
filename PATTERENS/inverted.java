public class inverted {
    public static void main(String args[]) {
        int n = 4;  // Define the value of n (number of rows)
        
        for (int i = 1; i <= n; i++) { 
            // Outer loop for the rows
            for (int j = 1; j <= (n - i + 1); j++) {  // Inner loop for printing stars
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
