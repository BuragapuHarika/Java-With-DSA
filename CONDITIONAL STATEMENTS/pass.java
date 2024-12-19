import java.util.Scanner;
public class pass {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt() ;

        // ternary operator
        String value =((marks >= 33)) ? "pass" : " fail";
        System.out.println(value);

    }
}
