public class LongestCommonSubsequence {
    static  int lcs(char[]X,char[]Y){
        int m=X.length;
        int n=Y.length;
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if (X[i-1]==Y[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1="abcd";
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        char []x=s1.toCharArray();
        char[]y=s2.toCharArray();
        int len=lcs(x,y);
        int n=s1.length();
        int insertion=n-len;
        System.out.println(insertion);

    }
}
