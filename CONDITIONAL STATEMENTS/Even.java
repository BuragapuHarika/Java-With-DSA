// public class Even {
//     public static void main(String args[])
//     {
//         int number = 26;
//         if (number % 2 == 0 )
//         {
//             System.out.println("it is the even number");
//         }
//         else 
//         {
//             System.out.println("it is the odd number");
//         }
//     }
// }




import java.util.*;
public class Even
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(number % 2 == 0)
    {
        System.out.println("Even");
    }
    else {
        System.out.println("Odd");
    }
}
}
