import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static void romanToInt(String str){
        int n=str.length();
        int result=0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<n-1;i++){
            if(map.get(str.charAt(i))>=map.get(str.charAt(i+1))){
                result=result+map.get(str.charAt(i));
            }else {
                result=result-map.get(str.charAt(i));
            }
        }
        result=result+map.get(str.charAt(n-1));
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str="III";
        String str2="XV";
        String str3="IV";
        romanToInt(str);
        romanToInt(str2);
        romanToInt(str3);
    }
}
