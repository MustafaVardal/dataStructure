package util.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import util.Queue;




public class QueueTest {


    private Queue queue;

    @Before
    public void setUp() throws Exception {
        this.queue = new Queue();
    }

    @Test
    public void testEnqueueDequeue(){
        this.queue.enqueue(5);
        assertEquals(5, this.queue.dequeue());
    }


    @Test
    public void testEnqueueMultiValue(){
        this.queue.enqueue(5);
        this.queue.enqueue(6);
        this.queue.enqueue(7);
        this.queue.enqueue(8);

        assertEquals(5, this.queue.dequeue());
        assertEquals(6, this.queue.dequeue());
        assertEquals(7, this.queue.dequeue());
        assertEquals(8, this.queue.dequeue());
    }

    @Test
    public void testIsEmpty(){
        assertTrue(this.queue.isEmpty());
    }

    @Test
    public void testIsFull(){
        for (int i = 0; i < 9; i++) {
            this.queue.enqueue(i);
        }

        assertTrue(this.queue.isFull());
    }

}

