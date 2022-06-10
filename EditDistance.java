//public class EditDistance {
//    static int min(int x,int y,int z){
//        if(x<=y && x<=z)
//            return x;
//        if(y<=z && y<=x)
//            return y;
//        else
//            return z;
//    }
//    static int editDistance(String s1,String s2,int m,int n){
//        if(m==0)
//            return n;
//        if(n==0)
//            return m;
//        if(s1.charAt(m-1)==s2.charAt(n-1))
//            return editDistance(s1,s2,m-1,n-1);
//        return 1+min(editDistance(s1,s2,m-1,n),editDistance(s1,s2,m,n-1),editDistance(s1,s2,m-1,n-1));
//    }
//
//    public static void main(String[] args) {
//        String str1 = "sunday";
//        String str2 = "saturday";
//        int m=str1.length();
//        int n=str2.length();
//        System.out.println(editDistance(str1,str2,m,n));
//    }
//}

//Dp
public class EditDistance {
    static int min(int x,int y,int z){
        if(x<=y && x<=z)
            return x;
        if(y<=x && y<=z)
            return y;
        else
            return z;
    }
    static int editDis(String str1,String str2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                    dp[i][j]=1+min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";
        int m=str1.length();
        int n=str2.length();
        System.out.println(editDis(str1,str2,m,n));
    }
}