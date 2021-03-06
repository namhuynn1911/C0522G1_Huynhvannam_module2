package ss9_DSA_DanhSach.exercise.arrayListBT1.mvc.model;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        System.out.println("khởi tạo thành công MyList với kích thước là:" + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("khởi tạo thành công với kích thước là :" + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("tham số bị lỗi");
            throw new IndexOutOfBoundsException("capacity :" + capacity);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("khởi tạo thành công với kích thước :" + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity :" + minCapacity);
        }
    }

    public int size() {
        return size;
    }

    public int length() {
        return elements.length;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index :" + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("lỗi index " + index);
        }
        E element = (E) this.elements[index];
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }

    public int indexOf(E e) {
        int index = -1;
        for(int i=0;i<size;i++) {
            if(this.elements[i].equals(e)) {
                index=i;
                break;
            }
        }
        return index;
    }
    public boolean contains(E e) {
        return this.indexOf(e)>=0;
    }
    public void clear() {
        size=0;
        for(int i =0;i<elements.length;i++) {
            elements[i]=null;
        }
    }
}
