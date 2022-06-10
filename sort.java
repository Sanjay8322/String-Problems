import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        String str = "sanjay";
//        char[ ]ch = str.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(ch);
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(Character.toLowerCase(o1),Character.toLowerCase(o2));
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Character c : list){
            sb.append(c.charValue());
        }
        System.out.println(sb.toString());
    }
}
