public class AddBinaryStrings {
    static String binary(String a,String b){
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while (i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            carry=sum>1?1:0;
            res.append(sum%2);
        }
        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String A = "1101";
        String B= "111";
        System.out.println(binary(A,B));
    }
}
