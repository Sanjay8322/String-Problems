import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
    static boolean validIp(String ip){
        String str="(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
        Pattern p = Pattern.compile(str);
        Matcher m=p.matcher(ip);
        if(ip==null){
            return false;
        }
        return m.matches();
    }

    public static void main(String[] args) {
        String str3 = "000.12.234.23.23";
        String str2 = "121.234.121.121";
        System.out.println(validIp(str2));
        System.out.println(validIp(str3));
    }
}
