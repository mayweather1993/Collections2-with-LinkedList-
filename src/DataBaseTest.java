import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zver on 02.06.2017.
 */
public class DataBaseTest {
    DataBase base;

    @Before
    public void setUp() {
        base = new CollectionDataBase(3);
    }

    @Test
    public void save() throws Exception {
        base.save(1);

        LinkedList<Integer> currentElements = base.findAllElements();
        assertEquals(new Integer(1), currentElements.get(0));
        base.save(2);
        currentElements = base.findAllElements();
        assertEquals(new Integer(2), currentElements.get(1));
        base.save(3);
        currentElements = base.findAllElements();
        assertEquals(new Integer(3), currentElements.get(2));
        base.save(4);
        currentElements = base.findAllElements();
        assertEquals(new Integer(2), currentElements.get(0));
        assertEquals(new Integer(3), currentElements.get(1));
        assertEquals(new Integer(4), currentElements.get(2));


    }

    @Test
    public void removeByIndex() throws Exception {
        base.save(1);
        assertEquals(1, base.size());
        base.save(2);
        assertEquals(2, base.size());
        base.removeByIndex(1);
        assertEquals(1, base.size());
        base.removeByIndex(0);
        assertEquals(0, base.size());


    }

    @Test
    public void removeByElement() throws Exception {
        base.save(1);
        LinkedList<Integer> currentElements = base.findAllElements();
        assertEquals(new Integer(1), currentElements.get(0));
        base.removeByElement(1);
        assertEquals(0, base.size());
    }


    @Test
    public void findAllElements() throws Exception {
        base.save(1);
        base.save(2);
        assertEquals(2, base.size());


    }

}