package objects;
import java.util.*;

public class Drunk {
    private Deque<Integer> d1, d2;
    public Drunk() {}
    public void init(){
        Scanner in = new Scanner(System.in);
        d1 = new LinkedList<Integer>();
        d2 = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        System.out.println("Write first deck: ");
        for (int i = 0; i < 5; i++) {
            d1.add(in.nextInt());
            set.add(d1.getLast());
        }
        System.out.println("Write second deck: ");
        for (int i = 0; i < 5; i++) {
            d2.add(in.nextInt());
            set.add(d2.getLast());
        }
        if (set.size() != 10){
            System.out.println("bad input, try again");
            init();
        }
        in.close();
    }
    public String play(){
        int k = 0;
        while (!d1.isEmpty() && !d2.isEmpty()){
            if (k == 106) return "botva";
            int a = d1.getFirst(), b = d2.getFirst();
            if ((a > b || (a == 0 && b == 9)) && !(a == 9 && b == 0)){
                d1.addLast(a);
                d1.addLast(b);
            } else {
                d2.addLast(a);
                d2.addLast(b);
            }
            d1.removeFirst();
            d2.removeFirst();
            k++;
        }
        return d1.isEmpty() ? "second " + k : "first " + k;
    }
}
