import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * tv * Created by Zver on 23.05.2017.
 */
public class MenuController {

    public void setBase(DataBase base) {
        this.base = base;
    }

    DataBase base;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    void addElementMenuItem() throws IOException {
        System.out.println("Enter your element : ");
        int element = Integer.parseInt(reader.readLine());
        base.save(element);
        System.out.println("Now you have : " + base.findAllElements());
    }

    void removeElementByIndex() throws IOException {
        System.out.println("Enter an index of element that you want to delete : ");
        int indexOfElementToRemove = Integer.parseInt(reader.readLine());
        base.removeByIndex(indexOfElementToRemove);
        System.out.println("Now you have array of elements :" + base.findAllElements());
    }

    void removeByElement() throws IOException {
        System.out.println("Enter an element that you want to delete : ");
        int element = Integer.parseInt(reader.readLine());
        base.removeByElement(element);
        System.out.println("Now you have array of elements : " + base.findAllElements());
    }

    void showFirstMenu() {
        System.out.println("Do you want a default size of you list? (Default size = 16) ");
        System.out.println("1.Yes ");
        System.out.println("2.Set a new size of list :");
    }

    void showSecondMenu() {
        System.out.println("So, what you gonna do with your list ?");
        System.out.println("1.Add an element to list");
        System.out.println("2.Remove an element in list by index");
        System.out.println("3.Remove by element");
        System.out.println("4.Quit the program");

    }
}

