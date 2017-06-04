import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zver on 23.05.2017.
 */
public class MainController {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController controller = new MenuController();

        int decision1;
        controller.showFirstMenu();
        decision1 = Integer.parseInt(reader.readLine());
        switch (decision1) {
            case 1:
                System.out.println("Your size of list = 16");
                decision1 = 16;
                break;
            case 2:
                System.out.println("Enter size of your list : ");
                decision1 = Integer.parseInt(reader.readLine());
                break;
            default:
                System.out.println("Incorrect choice , try again");
                break;

        }
        DataBase base = new CollectionDataBase(decision1);
        controller.setBase(base);
        int decision2;
        do {
            controller.showSecondMenu();
            decision2 = Integer.parseInt(reader.readLine());
            switch (decision2) {
                case 1:
                    controller.addElementMenuItem();
                    break;
                case 2:
                    controller.removeElementByIndex();
                    break;
                case 3:
                    controller.removeByElement();
                    break;
                case 4:
                    System.out.println("Thanks for using my program , good bye");
                    break;
                default:
                    System.out.println("Incorrect choice , try again");
            }


        }
        while (decision2 != 4);
    }
}
