public  class array {
    int[] queue = new int[5];
    int front = 0;
    int rear = 0;

    public void enqueue(int data) {
        if (rear == queue.length) {
            System.out.println("Queue is overflow");
            return;
        }
        queue[rear++] = data;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = queue[front++];
            System.out.println("Dequeued: " + data);
            return data;
        }
    }

    public void display(){
        if(rear == front)
        {
            System.out.println("Queue is the empty");
        }
        if(front > rear )
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            System.out.println("Enter the Queue elements:");
            for(int i=front;i <= rear ; i++)
            {
                System.out.println(queue[i] + " ");
            }
        }
    }

        public static void main(String args[])
        {
            array q = new array();
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.dequeue(); // underflow test
        }
    }

    