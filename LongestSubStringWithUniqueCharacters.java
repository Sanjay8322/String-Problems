import java.util.HashMap;

public class LongestSubStringWithUniqueCharacters {
    static int longestSubString(String str){
        int n=str.length();
        int r=0;
        int l=0;
        int len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (r<n){
            if(map.containsKey(str.charAt(r))){
                l=Math.max(map.get(str.charAt(r))+1,l);
            }
            map.put(str.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(longestSubString(str));
    }
}