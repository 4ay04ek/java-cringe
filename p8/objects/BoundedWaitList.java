package objects;

/**
 * Класс ограниченного списка ожидания
 */
public class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Поле ёмкости
     */
    private int capacity;

    /**
     * Конструктор - создает пустую очередь {@link WaitList#content} и задает её ёмкость
     * @param capacity - ёмкости
     */
    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    /**
     * Метод получения ёмкости {@link BoundedWaitList#capacity}
     * @return возвращает ёмкость
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Метод добавления элемента в список {@link WaitList#content} с проверкой на вместимость.
     */
    @Override
    public void add(E element){
        if (content.size() == capacity) return;
        content.add(element);
    }

    /**
     * toString()
     * @return String
     */
    @Override
    public String toString() {
        return "BoundedWaitList [content=" + content + ", capacity=" + capacity + "]";
    }
}
