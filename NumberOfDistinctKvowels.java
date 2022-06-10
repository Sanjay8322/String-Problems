public class NumberOfDistinctKvowels {
    static int power(int x,int y,int mod){
        int res=1;
        x=x%mod;
        if(x==0)
            return 0;
        while (y>0){
            if((y&1)!=0) {                                // (y&1)!=0 ---> (y%2)
                res = (res * x) % mod;
            }
            y=y>>1;                                       // (y>>1) ---> (y/2)
            x=(x*x)%mod;
        }
        return res;
    }
    static int nOfDistinct(int n,int k){
        int sum=1;
        int mod=1000000007;
        int[][]dp=new int[n+1][k+1];
        for(int i=1;i<=n;i++){
            dp[i][0]=sum*21;
            dp[i][0]%=mod;
            sum=dp[i][0];
            for(int j=1;j<=k;j++){
                if(i==j){
                    dp[i][j]=power(5,i,mod);
                }
                else if (j>i){
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=dp[i-1][j-1]*5;
                }
                dp[i][j]%=mod;
                sum+=dp[i][j];
                sum%=mod;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=3;
        int k=3;
        System.out.println(nOfDistinct(n,k));
    }
}
