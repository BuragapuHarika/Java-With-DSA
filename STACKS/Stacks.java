import java.util.Stack;

public class Stacks {
    public static void main(String args[])
    {
        //  Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4); 
            System.out.println ("after pushing the elements in the stack : "+stack);

            stack.pop();
            System.out.println("After using the pop methos : "+stack);

            stack.peek();
            System .out.println("using the peek method :"+stack);

            stack.isEmpty();
            System.out.println("using the peek operation method in the stack the result is : "+stack);

            stack.size();
            System.out.println("Using the size operation using the size method :"+stack);



    }
    
}
