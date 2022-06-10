//import java.util.Arrays;
//
//public class DistinctSubsequences {
//    static final int size=256;
//    static int distinct(String str){
//        int n=str.length();
//        int[] last=new int[size];
//        Arrays.fill(last,-1);
//        int[] dp=new int[n+1];
//        dp[0]=1;
//        for(int i=1;i<=n;i++){
//            dp[i]=2*dp[i-1];
//            if(last[(int)str.charAt(i-1)]!=-1){
//                dp[i]=dp[i]-dp[last[(int)str.charAt(i-1)]];
//            }
//            last[(int)str.charAt(i-1) ]=(i-1);
//        }
//        return dp[n];
//    }
//
//    public static void main(String[] args) {
//        String str="ggg";
//        System.out.println(distinct(str));
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class DistinctSubsequences {
    static int distinct(String s){
        int n=s.length();
        int levelCount=0;
        int allCount=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),-1);
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(i==0){
                levelCount=1;
                map.put(c,1);
                allCount=1;
                continue;
            }
            levelCount=allCount+1;
            if(map.get(c)<0){
                allCount=allCount+levelCount;
            }
            else{
                allCount=allCount+levelCount-map.get(c);
            }
            map.put(c,levelCount);
        }
        return allCount;
    }

    public static void main(String[] args) {
        String str="gfg";
        System.out.println(distinct(str)+1);
    }
}