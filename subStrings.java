import java.util.ArrayList;
import java.util.List;

public class subStrings {
    static void subString(String string){
        int len=string.length();
        int count=0;
        List<String> l = new ArrayList<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                count++;
                l.add(string.substring(i,j));
            }
        }
        System.out.println(l);
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str="The Cat";
        subString(str);
    }
}
