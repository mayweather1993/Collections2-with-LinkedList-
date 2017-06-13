import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Zver on 23.05.2017.
 */
public class CollectionDataBase extends AbstractList<Integer> implements DataBase {
    Integer[] array;
    int size;

    public CollectionDataBase(int size) {
        array = new Integer[size];
    }

    @Override
    public void save(Integer element) {
        add(element);
    }

    @Override
    public void removeByIndex(int indexOfElement) {
        remove(indexOfElement);
    }

    @Override
    public Integer remove(int index) {
        Integer element = get(index);
        array[index] = null;
        size--;
        return element;
    }

    @Override
    public void removeByElement(Integer element) {
        int something = indexOf(element);
        remove(something);
    }


    @Override
    public LinkedList<Integer> findAllElements() {
        return new LinkedList<>(this);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public boolean contains(Object integer) {
        return indexOf(integer) >= 0;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iter(array);
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean add(Integer integer) {
        add(size, integer);
        return true;
    }

    @Override
    public Integer get(int index) {
        return array[index];
    }

    @Override
    public void add(int index, Integer element) {
        if (array.length == size) {
            System.arraycopy(array, 1, array, 0, array.length - 1);
        }
        if (index < array.length) {
            array[index] = element;
            size++;
        } else if (index == array.length) {
            array[--index] = element;
        }
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }
        array[index] = null;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object objects : c
                ) {
            add((Integer) objects);
        }
        return true;
    }

    @Override
    public void clear() {
        array = new Integer[array.length];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object object : c
                ) {
            remove(object);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object object :
                c) {
            boolean contains = contains(object);
            if (!contains) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
