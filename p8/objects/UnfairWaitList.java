package objects;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList(){
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element){
        content.remove(element);
        content.add(element);
    }

    @Override
    public String toString() {
        return "UnfairWaitList [content=" + content + "]";
    }
}
