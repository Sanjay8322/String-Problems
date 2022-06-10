public class MultiplyTwoLargeNumbers {
    static String multiply(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int result[]=new int[len1+len2];
        int i_n1=0;
        int i_n2=0;
        for(int i=len1-1;i>=0;i--){
            int carry=0;
            int n1=str1.charAt(i)-'0';
            i_n2=0;
            for(int j=len2-1;j>=0;j--){
                int n2=str2.charAt(j)-'0';
                int sum=(n1*n2) + result[i_n1 + i_n2]+carry;
                carry=sum/10;
                result[i_n1 + i_n2]=sum%10;
                i_n2++;
            }
            if(carry>0){
                result[i_n1 + i_n2]+=carry;
            }
            i_n1++;
        }
        int k=result.length-1;
        while (k>=0 && result[k]==0){
            k--;
        }
        if(k==-1){
            return "0";
        }
        String s="";
//        int l=result.length-1;
        while (k>=0){
            s+=(result[k]);
            k--;
        }
        return s;
    }

    public static void main(String[] args) {

        String str1 = "1235421415454545454545454544";
        String str2 = "1714546546546545454544548544544545";
        if((str1.charAt(0)=='-'||str2.charAt(0)=='-')&&(str1.charAt(0)!='-'||str2.charAt(0)!='0')){
            System.out.println("-");
        }
        if(str1.charAt(0)=='-'){
            str1=str1.substring(1);
        }
        if(str2.charAt(0)=='-'){
            str2=str2.substring(1);
        }
        System.out.println(multiply(str1,str2));
    }
}
