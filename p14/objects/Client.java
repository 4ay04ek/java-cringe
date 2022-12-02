package objects;

public class Client {
    public Chair chair;
    public void sit() {
        chair.action();
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }
}
