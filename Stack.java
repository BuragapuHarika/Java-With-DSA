public class Stack {
    public static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // maximum size of stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return a[top];
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        // Corrected usage
        System.out.println("Top element is: " + s.peek());

        s.pop();
        System.out.println("Popped element is: " + s.pop());

        s.print();
    }
}
