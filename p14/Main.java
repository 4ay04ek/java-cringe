import objects.*;

public class Main{
    public static void main (String args[]){
        AbstractChairFactory factory = new ChairFactory();
        FunctionalChair functionalChair = factory.createFunctionalChair();
        MagicChair magicChair = factory.createMagicChair();
        VictorianChair victorianChair = factory.createVictorianChair(150);
        Client client = new Client();
        client.setChair(victorianChair);
        client.sit();
        client.setChair(magicChair);
        client.sit();
        client.setChair(functionalChair);
        client.sit();
    }
}