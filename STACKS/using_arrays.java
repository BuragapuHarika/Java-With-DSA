public class using_arrays {
    int[] arr = new int[5];  // Corrected array declaration
    int top = -1; // Stack is initially empty

    // Push operation to push the elements
    public void push(int item) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        arr[++top] = item;  // Increment top first, then store item
        System.out.println("Element pushed to stack: " + item);


    }

    // now we have to do the pop operation 
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("stack  is overflow and no element to do the pop "  );
            return -1 ;
        }
        else 
        {
            return arr[top--];

        }
    }

    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is the overflow");

        }
        return  arr[top];


    }
// to display the top of the elements in the stack 
    public int top()
    {
        if(top==-1)
        {
            System.out.println("Stack is the overflow");
            return -1;
        }
        return arr[top];

    }

    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is the overflow");
        }
        else
        {
            System.out.println(" elements in tthe stack are : ");
            // for(int i = top; i > 0 ; i--)
            // {
            //     System.out.println(top);
            // }
            for(int i = 0 ; i >= top; i++)
            {
                System.out.println(top);
            }
        }
    

    }

    public static void main(String args[])
    {
        using_arrays  stack = new using_arrays();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.pop();
        stack.peek();
        stack.display();
        stack.push(40);
        stack.peek();
        
    }
}