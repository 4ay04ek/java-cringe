package objects;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс cписка ожидания
 */
public class WaitList<E> implements IWaitList<E> {
    /** Поле очереди */
    protected ConcurrentLinkedQueue<E> content;

    /** Конструктор - создание пустой очереди 
     *  @see WaitList#WaitList()
    */
    public WaitList(){
        content = new ConcurrentLinkedQueue<E>();
    }

    /** Копирующий конструктор 
     *  @param c - контейнер для копирования
     *  @see WaitList#WaitList(Collection)
    */
    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<E>(c);
    }

    /**
     *  Метод добавления элемента в список {@link WaitList#content}
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     *  Проверка наличия элемента в списке {@link WaitList#content}
     *  @param element - элемент
     *  @return возвращает boolean - наличие элемента в списке
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     *  Проверка наличия коллекции в списке {@link WaitList#content}
     *  @param collection - коллекция
     *  @return возвращает boolean - наличие коллекции в списке
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     *  Проверка списка {@link WaitList#content} на пустоту
     *  @return возвращает boolean
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     *  Метод удаляет первый элемент в списке {@link WaitList#content}
     *  @return возвращает удаленный элемент
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     *  toString()
     *  @return String
     */
    @Override
    public String toString() {
        return "WaitList [content=" + content + "]";
    }   
}
