import java.util.HashMap;

public class LongestSubstringtoFormPalindromeRearranged {
    static int longest(String s){
        int n=s.length();
        int answer=0;
        int mask=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(mask,-1);
        for(int i=0;i<n;i++){
            int temp=(int)s.charAt(i)-'a';
            mask^=(1<<temp);
            if(hm.containsKey(mask)){
                answer=Math.max(answer,i-hm.get(mask));
            }else {
                hm.put(mask,i);
            }
            for(int j=0;j<26;j++){
                int mask2=mask^(1<<j);
                if(hm.containsKey(mask2)){
                    answer=Math.max(answer,i-hm.get(mask2));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s="adbabd";
        System.out.println(longest(s));
    }
}