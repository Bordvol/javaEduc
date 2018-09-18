package com.study.datastructures.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    List listWithZeroElements;
    List listWithFiveElements;
    List listWithTenElements;

    @Before
    public void before() {
        listWithZeroElements = new ArrayList();
        listWithFiveElements = new ArrayList();
        listWithTenElements = new ArrayList();

        listWithFiveElements.add("A");
        listWithFiveElements.add("B");
        listWithFiveElements.add("C");
        listWithFiveElements.add("D");
        listWithFiveElements.add("D");

        for (int i = 0; i < 10; i++) {
            listWithTenElements.add(i);
        }
    }

    @Test
    public void testGetFromListWithFiveElements() {
        assertEquals("A", listWithFiveElements.get(0));
        assertEquals("B", listWithFiveElements.get(1));
        assertEquals("C", listWithFiveElements.get(2));
        assertEquals("D", listWithFiveElements.get(3));
        assertEquals("D", listWithFiveElements.get(4));
    }

    @Test
    public void testGetFromListWithTenElements() {
        for (int i = 0; i < 10; i++) {
            assertEquals(i, listWithTenElements.get(i));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFromIndexLessThanZero() {
        listWithFiveElements.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFromIndexGreaterThanSize() {
        listWithFiveElements.get(7);
    }

    @Test
    public void testRemove() {
        listWithTenElements.remove(3);
        assertEquals(9, listWithTenElements.size());
    }

    @Test
    public void testSize() {
        assertEquals(5, listWithFiveElements.size());
        assertEquals(0, listWithZeroElements.size());
    }

    @Test
    public void testSet() {
        assertEquals("K",listWithFiveElements.set("K",2));
        assertEquals("K",listWithFiveElements.get(2));
    }

    @Test
    public void testIsEmpty() {
        assertEquals(false,listWithFiveElements.isEmpty());
    }

    @Test
    public void testContains() {
        assertEquals(true,listWithFiveElements.contains("A"));
        assertEquals(false,listWithFiveElements.contains("Y"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(3,listWithFiveElements.indexOf("D"));
    }
    @Test
    public void testLastIndexOf() {
        assertEquals(4,listWithFiveElements.lastIndexOf("D"));
    }


}