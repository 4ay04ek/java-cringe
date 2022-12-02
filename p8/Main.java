import objects.*;

public class Main{
    public static void main (String args[]){
        WaitList<Integer> wl = new WaitList<Integer>();
        BoundedWaitList<Integer> bwl = new BoundedWaitList<Integer>(5);
        UnfairWaitList<Integer> uwl = new UnfairWaitList<Integer>();
        for (int i = 0; i < 10; i++) {
            int v = (int)(Math.random() * 100);
            wl.add(v);
            bwl.add(v);
            uwl.add(v);
        }
        System.out.println("Was: ");
        System.out.println(wl);
        System.out.println(bwl);
        System.out.println(uwl);
        uwl.moveToBack(wl.remove());
        System.out.println("\nAfter remove wl[first] from uwl:");
        System.out.println(wl);
        System.out.println(bwl);
        System.out.println(uwl);
    }
}