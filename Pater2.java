import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pater2 {
    public static void main(String[] args) {
        String str1 = "Client Received 15 euro";
        String str2 = "150$ transmitted to client";
        String str3 = "commission 45 hryvna paid";
        Pattern pater1 = Pattern.compile("(\\d{2}\\seuro)");
        Matcher m1 = pater1.matcher(str1);
        while (m1.find()) {
            System.out.println(str1.substring(m1.start(), m1.end()));
        }
        Pattern pater2 = Pattern.compile("(\\b\\d{3}[$])");
        Matcher m2 = pater2.matcher(str2);
        while (m2.find()) {
            System.out.println(str2.substring(m2.start(), m2.end()));
        }
        Pattern pater3 = Pattern.compile("(\\d{2}\\shryvna)");
        Matcher m3 = pater3.matcher(str3);
        while (m3.find()) {
            System.out.println(str3.substring(m3.start(), m3.end()));
        }
    }

}
