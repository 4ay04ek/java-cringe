import objects.Drunk;

public class Main{
    public static void main (String args[]){
        Drunk drunk = new Drunk();
        drunk.init();
        System.out.println(drunk.play());
    }
}