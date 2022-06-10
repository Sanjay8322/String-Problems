public class MinimumDeletion {

    static void minDel(String str){
        int minDeletion= str.length() - lps(str);
        System.out.println(minDeletion);
    }
    static int lps(String str){
        int n=str.length();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    arr[i][j]=2+arr[i+1][j-1];
                }else{
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        minDel(str);
    }
}
