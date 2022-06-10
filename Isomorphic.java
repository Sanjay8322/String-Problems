import java.util.Arrays;

//import java.util.HashMap;
//import java.util.Map;
//
//public class Isomorphic {
//    static boolean isIso(String s,String t){
//        if(s.length()!=t.length()){
//            return false;
//        }
//        Map<Character,Character> sMap = new HashMap<>();
//        Map<Character,Character> tMap = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            Character sChar = s.charAt(i);
//            Character tChar = t.charAt(i);
//            if(sMap.containsKey(sChar)){
//                if(sMap.get(sChar)!=tChar){
//                    return false;
//                }
//            }else {
//                sMap.put(sChar,tChar);
//            }
//            if(tMap.containsKey(tChar)){
//                if(tMap.get(tChar)!=sChar){
//                    return false;
//                }
//            }else{
//                tMap.put(tChar,sChar);
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String s="egg";
//        String t="add";
//        System.out.println(isIso(s,t));
//    }
//}
public class Isomorphic {
    static  final int size=256;
    static boolean isIso(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int map[]=new int[size];
        Boolean [] marked = new Boolean[size];
        Arrays.fill(map,-1);
        Arrays.fill(marked,Boolean.FALSE);
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)]==-1){
                if(marked[t.charAt(i)]==true){
                    return false;
                }else{
                    marked[t.charAt(i)]=true;
                }
                map[s.charAt(i)]=t.charAt(i);
            }else {
                if (map[s.charAt(i)]!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="egg";
        String t="atd";
        System.out.println(isIso(s,t));
    }
}