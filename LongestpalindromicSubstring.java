//public class LongestpalindromicSubstring {
//    static void print(String str,int low,int high){
//        for(int i=low;i<=high;i++){
//            System.out.print(str.charAt(i)+" ");
//        }
//    }
//    static int longestPalindrome(String str){
//        int n=str.length();
//        int max=1;
//        int start=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int flag=1;
//                for(int k=0;k<(j-i+1)/2;k++)
//                    if(str.charAt(i+k)!=str.charAt(j-k))
//                        flag=0;
//                if(flag!=0&& (j-i+1)>max){
//                    start=i;
//                    max=j-i+1;
//                }
//            }
//        }
//        print(str,start,start+max-1);
//        return max;
//    }
//
//    public static void main(String[] args) {
//        String str = "forgeeksskeegfor";
//        System.out.println(longestPalindrome(str));
//    }
//}
public class LongestpalindromicSubstring {
    static void print(String str,int low,int end){
        System.out.println(str.substring(low,end+1));
    }
    static int longestPalindrome(String str){
        int n=str.length();
        int max=1;
        int start=0;
        int count=0;
        boolean dp[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
//            count++;
        }
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) {
//                count++;
                dp[i][i + 1] = true;
                start=i;
                max=2;
            }
        }
        for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j=k+i-1;
                if(dp[i+1][j-1]&&str.charAt(i)==str.charAt(j)){
//                    count++;
                    dp[i][j]=true;
                    if(k>max){
                        max=k;
                        start=i;
                    }
                }
            }
        }
        System.out.println();
        print(str,start,start+max-1);
        return max; //if we asked count all palindrome substrings just increment count wherever we put true in dp table
    }

    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(longestPalindrome(str));
    }
}