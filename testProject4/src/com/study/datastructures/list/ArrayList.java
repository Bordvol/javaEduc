package com.study.datastructures.list;


import com.study.datastructures.queue.Node;

// TDD
// Ctrl + Shift + T
public class ArrayList implements List {
    Object[] array = new Object[10];
    int size;

    private void validateIndex(int index)
    {
        if ((index<0)||(index>size-1)){
            throw new IndexOutOfBoundsException();
        }
    }

    private void validateLength()
    {
        if (array.length == size)
        {
            Object[] newArray = new Object[size*2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public void add(Object value) {
        validateLength();
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        validateIndex(index);
        validateLength();
        System.arraycopy(array, index, array, index+1, size-index);
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        validateIndex(index);
        Object result = array[index];
        System.arraycopy(array, index+1, array, index, size-index-1);
        size--;
        return result;
    }

    @Override
    public Object get(int index) {
        validateIndex(index);
        return array[index];
    }

    @Override
    //to do - return prev
    public Object set(Object value, int index) {
        validateIndex(index);
        array[index] = value;
        return array[index];
    }

    @Override
    public void clear() {
        Object[] array = new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i <size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
      //  if (indexOf(value)!=-1){
       //     return true;
      //  }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        int i=0;
        for (Object object: array)
        {
            if (object.equals(value)) {
               return i;
            }
            i++;
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = size-1; i > 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if  (array[i].equals(null)==false) {
                result = result.isEmpty() ? (String) array[i] : result + ", " + array[i];
            }
        }
        return result;
    }
}