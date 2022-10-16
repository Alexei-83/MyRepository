import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pater {
    public static void main(String[] args) {
        String str = "dfsds  sdfgs44dfsd   sdfs lkjljl rffr";
        Pattern pater = Pattern.compile("\\b\\w*\\d+\\w*,?\\b");
        Matcher m = pater.matcher(str);
        while (m.find()){
            System.out.println(str.substring(m.start(),m.end()));

        }
    }
}
