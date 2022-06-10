import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetter {
    static void firstLetter(String str){
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        String str="Jay won";
        firstLetter(str);
    }
}
