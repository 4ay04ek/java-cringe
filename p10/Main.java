import objects.*;

public class Main{ 
    public static void main (String args[]){
        Address address1 = new Address("Russia, Moscow, Moscow, Pushkina, Kolotushkina, 1, 1", ", ");
        Address address2 = new Address("Russia|Moscow|Moscow|Pushkina|Kolotushkina|1|1", "|");
        Address address3 = new Address("Russia-_-Moscow-_-Moscow-_-Pushkina-_-Kolotushkina-_-1-_-1", "-_-");
        Address address4 = new Address("Russia Moscow Moscow Pushkina Kolotushkina 1 1", " ");
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}