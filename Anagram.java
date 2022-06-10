//import java.util.Arrays;
//
//public class Anagram {
//    static boolean ana(char[] str1, char []str2){
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        for(int i=0;i< str1.length;i++){
//            if(str1[i]!=str2[i]){
//                return  false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        char[] s={'l','i','s','t','e','n'};
//        char[] t={'s','i','l','e','n','n'};
//        System.out.println(ana(s,t));
//    }
//}

//import java.util.Arrays;
//
//public class Anagram {
//    static final int size=256;
//    static boolean ana(char[] s, char[] t){
//        int count1[]=new int[size];
//        int count2[]=new int[size];
//        Arrays.fill(count1,0);
//        Arrays.fill(count2,0);
//        for(int i=0;i<s.length;i++){
//            count1[s[i]]++;
//        }
//        for(int i=0;i<t.length;i++){
//            count2[t[i]]++;
//        }
//        for(int i=0;i<size;i++){
//            if(count1[i]!=count2[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        char[] s={'l','i','s','t','e','n'};
//        char[] t={'s','i','l','e','n','t'};
//        System.out.println(ana(s,t));
//    }
//}
//
//import java.util.Arrays;
//
//public class Anagram {
//    static final int size=256;
//    static boolean Ana(char[]s,char[]t){
//        int count[]=new int[size];
//        Arrays.fill(count,0);
//        for(int i=0;i<s.length;i++){
//            count[s[i]-'a']++;
//            count[t[i]-'a']--;
//        }
//        for(int i=0;i<size;i++){
//            if(count[i]!=0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        char[]s={'g','e','e','k','s'};
//        char[]t={'k','e','e','g','s'};
//        System.out.println(Ana(s,t));
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    static boolean isAna(String s,String t){
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        for(Map.Entry<Character,Integer> ms: map.entrySet()){
            if(ms.getValue()!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="geeks";
        String t="keeg";
        System.out.println(isAna(s,t));
    }
}