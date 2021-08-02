package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 29.07.2021.
 * Time: 21:08.
 */
public class MyArraylist<T> implements Iterable<T> {
    private int size;
    private int count = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;


    // Constructor by initialCapacity
    public MyArraylist(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.array = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }


    // Constructor by defaultCapacity
    public MyArraylist() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    private int findSize() {
        size = count;
        return size;
    }

    // Method grow . Every time when size == length our Array grow by 1 step
    private void grow() {
        int newCapacity;
        if (count == array.length) {
            newCapacity = count + 1;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private int indexOf(Object o) {
        Object[] objects = array;
        if (o == null) {
            for (int i = 0; i < objects.length - 1; i++) {
                if (objects[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < objects.length - 1; i++) {
                if (objects[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Method add in array
    public Boolean add(T t) {
        grow();
        array[count] = t;
        count++;
        return true;
    }

    // Method remove object in array and return new  Array
    public T remove(int index) {
        T oldValue = (T) array[index];

        int newSize = size - index - 1;
//        array = Arrays.copyOfRange(array, index +1, newSize);
        if (newSize > 0) {
            System.arraycopy(array, index + 1, array, index, newSize);
        }
        array[--size] = null;
        count--;
        return oldValue;
    }

    public Boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int size() {
//        System.out.println("Length of the Array is " + array.length);
        return findSize();
    }

    public T get(int index) {
        if (array[index] == null) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = 0;

            /**
             * Returns true if the array has more elements.
             */
            @Override
            public boolean hasNext() {
                return (i < array.length && array[i] != null);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) array[i++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
