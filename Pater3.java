import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pater3 {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона");
        Scanner sc = new Scanner(System.in);
        String numberTelefon = sc.nextLine();

        Pattern pattern = Pattern.compile("^(([+]?\\d{2}[- .]?))(\\d{3}[- .]?)(\\d{2}[- .]?){2}\\d{3}$"
                + "|^(([+]?\\d{3}[- .]?))(\\d{2}[- .]?)(\\d{2}[- .]?){2}\\d{3}$");
        Matcher m = pattern.matcher(numberTelefon);
        System.out.println(m.find());
    }
}
