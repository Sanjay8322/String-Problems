//public class LongestPalindromicSubsequence {
//    static int lps(String s,int start,int end){
//        if(start>end){
//            return 0;
//        }
//        if(start==end){
//            return 1;
//        }
//        if(s.charAt(start)==s.charAt(end)){
//            return 2+lps(s,start+1,end-1);
//        }
//        return Math.max(lps(s,start+1,end),lps(s,start,end-1));
//    }
//
//    public static void main(String[] args) {
//        String str="aebcbda";
//        System.out.println(lps(str,0,str.length()-1));
//    }
//}
//
//public class LongestPalindromicSubsequence {
//    static int lps(String s,int start,int end,Integer[][]arr){
//        if(start>end){
//            return 0;
//        }
//        if(start==end){
//            return 1;
//        }
//        if(arr[start][end]==null){
//            if(s.charAt(start)==s.charAt(end)){
//                arr[start][end]=2+lps(s,start+1,end-1,arr);
//            }else{
//                arr[start][end]=Math.max(lps(s,start+1,end,arr),lps(s,start,end-1,arr));
//            }
//        }
//        return arr[start][end];
//    }
//
//    public static void main(String[] args) {
//        String s="aebcbda";
//        int n=s.length();
//        Integer [][]arr=new Integer[n][n];
//        System.out.println(lps(s,0,n-1,arr));
//    }
//}
public class LongestPalindromicSubsequence {
    static int lps(String s,int start,int end){
        int n=s.length();
        int arr[][]=new int[n][n];
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    arr[i][j]=2+arr[i+1][j-1];
                }else{
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];
    }

    public static void main(String[] args) {
        String s="aebcbda";
        System.out.println(lps(s,0,s.length()-1));
    }
}