import objects.*;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<Integer>();
        Integer a[] = {1, 2, 3, 4, 5};
        ma.convert(a);
        System.out.println(ma);
        System.out.println(ma.get(2));
        MyArray<String> ma1 = new MyArray<String>();
        String b[] = {"one", "two", "three", "four", "five"};
        ma1.convert(b);
        System.out.println(ma1);
        System.out.println(ma1.get(2));
    }
}
