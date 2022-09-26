import java.util.Locale;
import java.util.Scanner;

public class BigDomashka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи три строки");
        String [] st = new String[3];
        st[0] = sc.nextLine();
        st[1] = sc.nextLine();
        st[2] = sc.nextLine();

        st[0] = st[0].toLowerCase();
        st[1] = st[1].toUpperCase();
        st[2] = st[2];

        for (String string : st) {
            System.out.println(string);
        }


    }
}
