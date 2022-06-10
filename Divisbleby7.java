public class Divisbleby7 {
    static boolean divisible(String num){
        int n=num.length();
        if(n==0) {
            return true;
        }
        if(n%3==1){
            num="00"+num;
        }
        if(n%3==2){
            num="0"+num;
        }
        n=num.length();
        int gSum=0,p=1;
        for(int i=n-1;i>=0;i--){
            int group=0;
            group+=num.charAt(i--) -'0';
            group+=(num.charAt(i--) -'0') * 10;
            group+=(num.charAt(i) -'0') * 100;
            gSum=gSum+group*p;
            p=p*-1;
        }
        return (gSum%7==0);
    }

    public static void main(String[] args) {
        String num = "8955795758";
        System.out.println(divisible(num) ? "Divisible by 7" : "Not Divisible  by 7");
    }
}
