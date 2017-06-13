import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Zver on 23.05.2017.
 */
public interface DataBase extends Collection<Integer> {
    void save(Integer element);

    void removeByIndex(int indexOfElement);

    void removeByElement(Integer element);

    LinkedList<Integer> findAllElements();
}
