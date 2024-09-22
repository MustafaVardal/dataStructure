package util;

public class Queue {

    private static final int INITIAL_SIZE = 10;

    private int head;
    private int tail;
    private int[] q;

    public Queue() {
        this.head = 0;
        this.tail = 0;
        this.q = new int[INITIAL_SIZE];
    }

    public boolean isEmpty() {
        return this.head == this.tail;
    }

    public boolean isFull() {
        if (this.tail == this.q.length - 1 && this.head == 0) {
            return true;
        }
        if (this.tail + 1 == this.head) {
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        if (this.isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        this.q[this.tail] = x;

        if (this.tail == this.q.length - 1) {
            this.tail = 0;
        } else {
            this.tail++;
        }
    }

    public int dequeue() {
        if (this.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }

        int x = this.q[this.head];
        if (this.head == this.q.length - 1) {
            this.head = 0;
        } else {
            this.head++;
        }
        return x;
    }
}
