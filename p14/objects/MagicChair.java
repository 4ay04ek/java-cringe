package objects;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("magic");
    }
    @Override
    public void action()
    {
        System.out.println("It is a magic chair!");
        doMagic();
    }

}
