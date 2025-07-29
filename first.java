import java.util.ArrayList;


public class first
{
    public static void main(String[] args) {
        ArrayList<Integer>  al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // System.out.println(al.get(3));// it gives the index number 
        // System.out.println(al.set(1,99));
        // al.set(1,89);// it sets the index number 

        // System.out.println(al.indexOf(89));// it gives the  index number in the array 

        // System.out.println(al.indexOf(50));// it gives ithe index number in the array 
        // System.out.println(al.lastIndexOf(90));// if does not match then it gives the -1 



        // System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());

        


    }
}