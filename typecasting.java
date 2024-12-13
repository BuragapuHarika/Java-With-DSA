
// import java.util.*;

// public class typecasting {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // float a = 25.12f;
//         // int b = (int) a;
//         // System.out.println(b);

//         // float marks = 99.999f;
//         // int marks2 = (int) marks;
//         // System.out.println(marks2);
//         char ch = 'a';
//         char ch2 = 'b';
//         int b = (int) ch;
//         int b2 = (int) ch2;
//         System.out.println(b);
//         System.out.println(b2);

//     }
// }




//TYPE PROMOTION IN EXPRESSONS

public class typecasting{
    public static void main(String args[])
    {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) (b));
        // System.out.println((int) (a));
        // System.out.println(a);
        // System.out.println(b-a);

        short a = 25;
        byte b = 5;
        char c = 'c';
        byte bt = (byte) (a + b + c) ; // it is the loosy conversation

    }
}