package util.test;

import org.junit.Before;
import org.junit.Test;
import util.Stack;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;


    @Before
    public void setUp() throws Exception {
        this.stack = new Stack();
    }

    @Test
    public void testPushPopOneElement() {
        this.stack.push(723);

        assertEquals(723, this.stack.pop());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.stack.isEmpty());
    }

    @Test
    public void testManyPushAndPop() {
        for (int i = 0; i < 100; i++) {
            this.stack.push(i);
        }
        for (int i = 99; i >= 0; i--) {
            assertEquals(i, this.stack.pop());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testEmptyPopException() {
        this.stack.pop();
    }
}