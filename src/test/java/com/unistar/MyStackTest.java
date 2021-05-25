package com.unistar;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * demo for TDD (Test Driven Development):
 * using Juni 4 for expected exception
 */
public class MyStackTest {
    private MyStack stack;

    @Before
    public void setup(){
        stack = new MyStack();
    }

    @Test
    public void verifyIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void verifyPush(){
        stack.push(new Object());
        assertFalse(stack.isEmpty());

        assertEquals(1, stack.size());
    }

    @Test
    public void verifyPeek(){
        assertNull(stack.peek());

        Object obj1 = new Object();
        stack.push(obj1);
        assertEquals(obj1, stack.peek());
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
    }

    // old method to verify exception
    @Test
    public void verifyPopEmpty1(){
        boolean thrown = false;
        try{
            stack.pop();
        }catch (EmptyStackException e){
            thrown = true;
            assertNotNull(e);
        }

        assertTrue(thrown);
    }

    @Test
    public void verifyPopEmpty2(){
        assertThrows(EmptyStackException.class,
                () -> stack.pop());
    }

    // in JUnit 4, we can simply use the expected attribute of the @Test annotation
    @Test(expected = EmptyStackException.class)
    public void verifyPopEmpty3(){
       stack.pop();
    }

    @Test
    public void verifyPop(){
        Object obj1 = new Object();
        stack.push(obj1);
        assertEquals(obj1, stack.pop());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void verifyPush2Peek1Pop1(){
        assertNull(stack.peek());

        Object obj1 = new Object();
        Object obj2 = new Object();
        stack.push(obj1);
        stack.push(obj2);
        assertEquals(obj2, stack.peek());
        assertEquals(2, stack.size());

        assertEquals(obj2, stack.pop());
        assertEquals(1, stack.size());
    }

}
