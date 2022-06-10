public class Encrypt {
    static void encrypt(String s){
        int count=0;
        String ans="";
        char c=s.charAt(0);
        count=1;
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else {
                ans+=c;
                String hx="";
                while (count!=0){
                    int rem=count%16;
                    if(rem<10){
                        hx+=(char)('0'+rem);
                    }else {
                        hx+=(char)('a'+(rem-10));
                    }
                    count/=16;
                }
                ans+=hx;
                c=s.charAt(i);
                count=1;
            }
        }
        String hx="";
        ans+=c;
        while (count!=0){
            int rem=count%16;
            if(rem<10){
                hx+=(char)('0'+rem);
            }else {
                hx+=(char)('a'+(rem-10));
            }
            count/=16;
        }
        ans+=hx;
        String fin_ans="";
        for(int i=ans.length()-1;i>=0;i--){
            fin_ans+=ans.charAt(i);
        }
        System.out.println(fin_ans);
    }

    public static void main(String[] args) {
        String s="aaaaaaaaaaa";
        encrypt(s);
    }
}
