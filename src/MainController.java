import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zver on 23.05.2017.
 */
public class MainController {
    public static void main(String[] args) throws IOException, IncorrectNumberException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController controller = new MenuController();
        int decision1;
        controller.showFirstMenu();
        String text = reader.readLine();

        boolean b = CheckingNumber.isNumberic(text);
        if (!b) {
            throw new IncorrectNumberException("Please , write a number");
        }
        decision1 = Integer.parseInt(text);
        switch (decision1) {
            case 1:
                System.out.println("Your size of list = 16");
                decision1 = 16;
                break;
            case 2:
                System.out.println("Enter size of your list : ");
                String text3 = reader.readLine();
                boolean error = CheckingNumber.isNumberic(text3);
                if (!error) {
                    throw new IncorrectNumberException("Please , write a number");
                }
                decision1 = Integer.parseInt(text3);
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
            String text2 = reader.readLine();

            boolean c = CheckingNumber.isNumberic(text2);
            if (!c) {
                throw new IncorrectNumberException("Please , write a number");
            }

            decision2 = Integer.parseInt(text2);
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
