public class ExcelSheet2 {
    static int num(String str){
        int ans=0;
        int p=1;
        for(int i=str.length()-1;i>=0;i--){
            char c= str.charAt(i);
            ans+=(int) (c-'A'+1)*p;
            p*=26;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="BCD";
        System.out.println(num(str));
    }
}
