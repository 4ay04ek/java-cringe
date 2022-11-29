package objects;

import java.util.ArrayList;

public class MyArray<E> {
    ArrayList<E> arr;
    public void convert(E[] arr){
        this.arr = new ArrayList<E>();
        for (E e : arr) {
            this.arr.add(e);
        }
    }

    public E get(int index) {
        return this.arr.get(index);
    }

    @Override
    public String toString() {
        return "MyArray [arr=" + arr + "]";
    }
}
