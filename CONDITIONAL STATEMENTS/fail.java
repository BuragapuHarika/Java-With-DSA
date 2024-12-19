import java.util.Scanner;

public class fail
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // ternary Operator
        String value = ((marks >= 33)) ? "Pass " : "Fail";
        System.out.println(value);



    }
}