/**
 * Created by Zver on 15.06.2017.
 */
public class CheckingNumber {
    public static boolean isNumberic(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
