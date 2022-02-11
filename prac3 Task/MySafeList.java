package prac3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class MySafeList<E> implements List<E> {
    private static final Lock lock = new ReentrantLock();
    private List<E> my_list= new ArrayList<E>();

    @Override
    public int size() {
        lock.lock();
        lock.unlock();
        return my_list.size();
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        lock.unlock();

        return my_list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        lock.unlock();

        return my_list.contains(o);
    }

    @Override
    public Iterator iterator() {
        lock.lock();
        lock.unlock();
        return my_list.iterator();
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        lock.unlock();
        return my_list.toArray();
    }

    @Override
    public boolean add(Object o) {
        lock.lock();
        lock.unlock();
        return my_list.add((E) o);
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        lock.unlock();
        return my_list.remove(o);
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        lock.lock();
        List.super.replaceAll(operator);
        lock.unlock();
        my_list.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        lock.lock();
        List.super.sort(c);
        lock.unlock();
        my_list.sort(c);
    }

    @Override
    public boolean addAll(Collection c) {
        lock.lock();
        lock.unlock();
        return my_list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        lock.lock();
        lock.unlock();
        return addAll(index,c);
    }

    @Override
    public void clear() {
        lock.lock();
        lock.unlock();
        my_list.clear();
    }

    @Override
    public E get(int index) {
        lock.lock();
        lock.unlock();
        return my_list.get(index);
    }


    @Override
    public Object set(int index, Object element) {
        lock.lock();
        lock.unlock();
        return my_list.set(index, (E) element);
    }

    @Override
    public void add(int index, Object element) {
        lock.lock();
        my_list.add(index, (E) element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        lock.lock();
        lock.unlock();
        return my_list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        lock.unlock();
        return my_list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        lock.unlock();
        return my_list.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        lock.lock();
        lock.unlock();
        return my_list.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        lock.lock();
        lock.unlock();
        return my_list.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        lock.lock();
        lock.unlock();
        return my_list.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<E> spliterator() {
        lock.lock();
        lock.unlock();
        return my_list.spliterator();
    }

    @Override
    public boolean retainAll(Collection c) {
        lock.lock();
        lock.unlock();
        return my_list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        lock.lock();
        lock.unlock();
        return my_list.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        lock.lock();
        lock.unlock();
        return my_list.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        lock.lock();
        lock.unlock();
        return  my_list.toArray(a);
    }
}
