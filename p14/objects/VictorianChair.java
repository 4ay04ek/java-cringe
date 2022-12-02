package objects;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public void action()
    {
        System.out.println("It is a victorian chair!");
        System.out.println("It's age is "+ age);
    }
}
