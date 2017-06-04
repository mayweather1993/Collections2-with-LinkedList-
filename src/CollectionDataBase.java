import java.util.LinkedList;

/**
 * Created by Zver on 23.05.2017.
 */
public class CollectionDataBase implements DataBase {
    LinkedList<Integer> list;
    int expectedSize;

    public CollectionDataBase(int size) {
        list = new LinkedList<>();
        expectedSize = size;
    }

    @Override
    public void save(Integer element) {
        if (list.size() == expectedSize) {
            list = new LinkedList<>(list.subList(1, expectedSize));
        }

        list.add(element);
    }

    @Override
    public void removeByIndex(int indexOfElement) {
        list.remove(indexOfElement);
    }

    @Override
    public void removeByElement(int element) {
        list.remove(element);
    }

    @Override
    public LinkedList<Integer> findAllElements() {
        return list;
    }
}
