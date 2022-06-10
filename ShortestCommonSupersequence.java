public class ShortestCommonSupersequence {
    static String lcs(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        String dp[][]=new String[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                if(i==0 || j==0)
                    dp[i][j]="";
                else if (str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+str1.charAt(i-1);
                else
                    dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
            }
        }
        return dp[len1][len2];
    }
    static int scs(String str1,String str2){
        String commonSupersequnce = lcs(str1,str2);
        char []c=commonSupersequnce.toCharArray();
        int p1=0;
        int p2=0;
        String ans="";
        for(char ch:c){
            while (str1.charAt(p1)!=ch)
                ans+=str1.charAt(p1++);
            while (str2.charAt(p2)!=ch)
                ans+=str2.charAt(p2++);
            ans+=ch;
            p1++;
            p2++;
        }
        ans+=str1.substring(p1)+str2.substring(p2);
//        return ans;
        int res=ans.length();
        return res;
    }

    public static void main(String[] args) {
        String str1="abcd";
        String str2="xycd";
        System.out.println(scs(str1,str2));
    }
}
