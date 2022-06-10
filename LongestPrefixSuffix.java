//public class LongestPrefixSuffix {
//    static int prefix(String str){
//        int n=str.length();
//        int i=(n+1)/2;
//        int len=0;
//        while (i<n){
//            if(str.charAt(i)==str.charAt(len)){
//                len++;
//                i++;
//            }
//            else {
//                i=i-len+1;
////                i++;
//                len=0;
//            }
//        }
//        return len;
//    }
//
//    public static void main(String[] args) {
//        String str="aaaa";
//        System.out.println(prefix(str));
//    }
//}

public class LongestPrefixSuffix {
    static  int prefixSuffix(String str){
        int n=str.length();
        int [] lps=new int[n];
        lps[0]=0;
        int len=0;
        int i=1;
        while (i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                    i++;
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int res= lps[n-1];
        return  res;
    }

    public static void main(String[] args) {
        String s="aabcdaabc";
        System.out.println(prefixSuffix(s));
    }
}