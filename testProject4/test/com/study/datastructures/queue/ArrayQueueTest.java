package com.study.datastructures.queue;


import java.lang.NullPointerException;
import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayQueueTest {

    @Test
    public void testQueueAndDequeueWithinCapacity() {

        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.enqueue("OCTOBER");
        queue.enqueue("NOVEMBER");
        queue.enqueue("DECEMBER");
        assertEquals(4, queue.size());
        assertEquals("SEPTEMBER", queue.dequeue());
        assertEquals(4, queue.size());

    }

    @Test
    public void testQueueAndDequeueAboveCapacity() {
        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.enqueue("OCTOBER");
        queue.enqueue("NOVEMBER");
        queue.enqueue("DECEMBER");
        queue.enqueue("JANUARY");
        queue.enqueue("FEBRUARY");
        assertEquals(6, queue.size());
        assertEquals("SEPTEMBER", queue.dequeue());
        assertEquals(6, queue.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeueFromEmptyQueue() {
        Queue queue = new ArrayQueue();
        assertEquals(0, queue.size());
        queue.dequeue();

    }
    @Test
    public void testEnqueueAndPeek() {
        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.enqueue("OCTOBER");
        queue.enqueue("NOVEMBER");
        queue.enqueue("DECEMBER");
        assertEquals("DECEMBER", queue.peek());
        assertEquals(4, queue.size());
    }

    @Test
    public void testRemoveExistentValue() {
        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.enqueue("OCTOBER");
        queue.enqueue("NOVEMBER");
        queue.enqueue("DECEMBER");
        assertEquals(true, queue.remove("NOVEMBER"));
    }
/*
    @Test(expected = NullPointerException.class)
    public void testRemoveNonExistentValue() {
        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.remove("MAY");
    }
*/
    @Test
    public void testQueueContainsValue() {
        Queue queue = new ArrayQueue();
        queue.enqueue("SEPTEMBER");
        queue.enqueue("OCTOBER");
        queue.enqueue("NOVEMBER");
        assertEquals(true,  queue.contains("NOVEMBER"));
        assertEquals(false, queue.contains("MAY"));
    }

}