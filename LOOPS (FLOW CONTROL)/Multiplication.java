// Multiplication of a table by the user
import java.util.*;

public class Multiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = sc.nextInt();

        int i ;
for (i = 1; i <= 10; i++) {
    System.out.println(n + " * " + i + " = " + (n * i));
}
        

        
    }
}

