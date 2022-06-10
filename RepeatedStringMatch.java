//public class RepeatedStringMatch {
//    static int repeat(String str1,String str2){
//        int n=str1.length();
//        int count=1;
//        for(int i=0;i<n;i++){
//            str1+=str1;
//            count++;
//            if(str1.contains(str2)){
//                return count;
//            }
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        String A = "abcd";
//        String B ="cdabcdab";
//        System.out.println(repeat(A,B));
//    }
//}

public class RepeatedStringMatch {
    static boolean isSubString(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(str2.charAt(i+j)!=str1.charAt(j))
                    break;
            }
            if(j==m)
                return true;
        }
        return false;
    }
    static int minRepetation(String str1,String str2){
        String s=str1;
        int ans=1;
        while (s.length()<str2.length()){
            s+=str1;
            ans++;
        }
        if(isSubString(str2,s)){
            return ans;
        }
        if(isSubString(str2,s+str1)){
            return ans+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String A = "abcd";
        String B = "cdabcdab";
        System.out.println(minRepetation(A,B));
    }
}