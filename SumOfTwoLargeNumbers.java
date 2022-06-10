//public class SumOfTwoLargeNumbers {
//    static String sum(String a,String b){
//        if(a.length()>b.length()){
//            String temp=a;
//            a=b;
//            b=temp;
//        }
//        int carry=0;
//        int n1=a.length();
//        int n2=b.length();
//        a=new StringBuilder(a).reverse().toString();
//        b=new StringBuilder(b).reverse().toString();
//        String res="";
//        for(int i=0;i<n1;i++){
//            int sum=((int)(a.charAt(i)-'0')+(int)(b.charAt(i)-'0')+carry);
//            res+=(char)(sum%10+'0');
//            carry=sum/10;
//        }
//        for(int i=n1;i<n2;i++){
//            int sum=((int)(b.charAt(i)-'0')+carry);
//            res+=(char)(sum%10+'0');
//            carry=sum/10;
//        }
//        if(carry!=0){
//            res+=(char)(carry+'0');
//        }
//        res=new StringBuilder(res).reverse().toString();
//        return res;
//    }
//
//    public static void main(String[] args) {
//        String str1 = "198111";
//        String str2 = "12";
//        System.out.println(sum(str1,str2));
//    }
//}

public class SumOfTwoLargeNumbers {
    static String findSum(String str1,String str2){
        if(str1.length()>str2.length()){
            String temp=str1;
            str1=str2;
            str2=temp;
        }
        int n1=str1.length();
        int n2=str2.length();
        int diff=n2-n1;
        int carry=0;
        String res="";
        for(int i=n1-1;i>=0;i--){
            int sum=((int)(str1.charAt(i)-'0')+(int)(str2.charAt(diff+i)-'0')+carry);
            res+=((char)((sum%10)+'0'));
            carry=sum/10;
        }
        for(int i=n2-n1-1;i>=0;i--){
            int sum=((int)(str2.charAt(i)-'0')+carry);
            res+=((char)((sum%10)+'0'));
            carry=sum/10;
        }
        if(carry>0){
            int sum=(char)(carry-'0');
        }
        res=new StringBuilder(res).reverse().toString();
        return res;
    }

    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";
        System.out.println(findSum(str1,str2));
    }
}