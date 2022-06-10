import java.util.HashMap;
import java.util.Map;

public class CountSubStrings {
    static int subString(String str,int k){
        int n=str.length();
        int answer=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        if(map.size()==k){
            answer++;
        }
        for(int i=k;i<n;i++){
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }

            map.put(str.charAt(i-k),map.get(str.charAt(i-k))-1);

            if(map.get(str.charAt(i-k))==0){
                map.remove(str.charAt(i-k));
            }
            if(map.size()==k){
                answer++;
            }
//            for(Map.Entry<Character , Integer> mp:map.entrySet()){
//                if(mp.getValue()>1){
//                    System.out.println(mp.getKey());
//                }
//            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str="abcc";
        System.out.println(subString(str,2));
    }
}