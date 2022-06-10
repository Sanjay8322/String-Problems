import java.util.HashMap;

public class LongestSubstringKuniqueCharacters {
    static boolean isLessthan(HashMap<Integer,Integer> map,Integer m){
        int count=0;
//        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
//            while (mp.getValue()>0){
//                count++;
//            }
        for(Integer key:map.keySet())
            if(map.get(key) > 0) count++;
        return (count<=m);
    }
    static String LongestSubString(String str,Integer m){
        int size=str.length();
        HashMap<Integer , Integer> map=new HashMap<>();
        int start=0;
        int end=0;
        int windowSize=1;
        int windowStart=0;
        int ch=(int) str.charAt(0);
        map.put(ch,1);
        for(int i=1;i<size;i++){
            ch=(int)str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                int temp=map.get(ch);
                map.put(ch,++temp);
            }
            end++;
            while (!isLessthan(map,m)){
                int temp=map.get((int)str.charAt(start));
                map.put((int)str.charAt(start),--temp);
                start++;
            }
            if(end-start+1>windowSize){
                windowSize=end-start+1;
                windowStart=start;
            }
        }
        return str.substring(windowStart,windowSize+windowStart);
    }

    public static void main(String[] args) {
        String str="aabacbebebe";
        int k=3;
        System.out.println(LongestSubString(str,k));
    }
}