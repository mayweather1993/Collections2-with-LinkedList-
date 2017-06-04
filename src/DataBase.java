import java.util.LinkedList;

/**
 * Created by Zver on 23.05.2017.
 */
public interface DataBase {
    void save(Integer element);

    void removeByIndex(int indexOfElement);

    void removeByElement(int element);

    LinkedList<Integer> findAllElements();
}
