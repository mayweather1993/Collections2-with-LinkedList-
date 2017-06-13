import java.util.Iterator;

/**
 * Created by Zver on 10.06.2017.
 */
public class Iter implements Iterator<Integer> {
    int position;

    public Iter(Integer[] array) {
        this.array = array;
    }

    Integer[] array;

    @Override
    public boolean hasNext() {

        return array.length > position;
    }

    @Override
    public Integer next() {
        Integer element = array[position];
        position++;
        return element;
    }
}
