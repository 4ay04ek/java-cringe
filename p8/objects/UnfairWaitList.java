package objects;

/**
 * Класс нечестного списка ожидания
 */
public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Конструктор - создает пустую очередь {@link WaitList#content}
     */
    public UnfairWaitList(){
        super();
    }
    
    /**
     * Удаляет конкретный элемент из списка {@link WaitList#content}
     * @param element - элемент
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Отправление конкретного элемента в конец списка {@link WaitList#content}
     * @param element - элемент
     */
    public void moveToBack(E element){
        content.remove(element);
        content.add(element);
    }

    /**
     * toString
     * @return String
     */
    @Override
    public String toString() {
        return "UnfairWaitList [content=" + content + "]";
    }
}
