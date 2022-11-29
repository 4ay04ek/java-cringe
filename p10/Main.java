import objects.*;

public class Main{ 
    public static void main (String args[]){
        PAddress address1 = new PAddress("Russia, Moscow, Moscow, Pushkina, Kolotushkina, 1, 1", ", ");
        PAddress address2 = new PAddress("Russia|Moscow|Moscow|Pushkina|Kolotushkina|1|1", "|");
        PAddress address3 = new PAddress("Russia-_-Moscow-_-Moscow-_-Pushkina-_-Kolotushkina-_-1-_-1", "-_-");
        PAddress address4 = new PAddress("Russia Moscow Moscow Pushkina Kolotushkina 1 1", " ");
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}