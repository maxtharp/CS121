package activity33;

public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        // 1
        System.out.println("Number 1");
        System.out.println("--------");
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println();

        // 2
        System.out.println("Number 2");
        System.out.println("--------");
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println();

        // 3
        System.out.println("Number 3");
        System.out.println("--------");
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println("Remove " + queue.dequeue());
        System.out.println();

        // 4
        System.out.println("Number 4");
        System.out.println("--------");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println();

        // 5
        System.out.println("Number 5");
        System.out.println("--------");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println();

        // 6
        System.out.println("Number 6");
        System.out.println("--------");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println();

        // 7
        System.out.println("Number 7");
        System.out.println("--------");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println();

        // 8
        System.out.println("Number 8");
        System.out.println("--------");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println();

        // 9
        System.out.println("Number 9");
        System.out.println("--------");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println();

        // 10
        System.out.println("Number 10");
        System.out.println("---------");
        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}
