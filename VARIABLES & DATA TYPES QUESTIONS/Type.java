// public class Type {
//     public static void main(String args[])
//     {
//         // int , float , long and the double all the values RE CONVERTED IN TO THE DOUBLE 

//         //byte, short , char -> converrted in to the int

//         // long , float , double -> converted in to the double 
//         // int a = 10;
//         // float b = 20.99f;
//         // long c = 20;
//         // double d = 30;
//         // double ans = a+b+c+d;
//         // System.out.println(ans);

//         // wrong 
//         //byte b = 5;
//         //b = b*2;

//         // RIGHT
//         // byte b = 5;
//         // byte a = (int)(b * 2);
//     }
//     }
// }

public class Type{
    public static void main(String args[])
    {
        byte b = 5;
        long a = (int) (b * 2 );
        System.out.println(a);
    }
}
