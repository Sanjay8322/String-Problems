//public class Atoi {
//    static void implementAtoi(String str){
//        int res=0;
//        for(int i=0;i<str.length();i++){
//            res=res*10+str.charAt(i)-'0';
//        }
//        System.out.println(res);
//    }
//
//    public static void main(String[] args) {
//        String str="123";
//        implementAtoi(str);
//    }
//}
//public class Atoi {
//    static void implementAtoi(String str){
//        int sign=1;
//        int res=0;
//        int i=0;
//        if(str.charAt(i)=='-'){
//            sign=-1;
//            i++;
//        }
//        while (i<str.length()){
//            res=res*10+str.charAt(i)-'0';
//            i++;
//        }
//        System.out.println(res*sign);
//    }
//
//    public static void main(String[] args) {
//        String str="-234";
//        implementAtoi(str);
//    }
//}
//
//public class Atoi {
//    static int implementAtoi(String str){
//        int i=0;
//        int res=0;
//        int sign=1;
//        if(str.charAt(i)==' '){
//            i++;
//        }
//        if(str.charAt(i)=='-'){
//            sign=1-2*(str.charAt(i)=='-'?1:0);
//            i++;
//        }
//        while (i<str.length() && str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9){
//            res=res*10+str.charAt(i)-'0';
//        }
//        return res*sign;
//    }
//
//    public static void main(String[] args) {
//        String str=" -123";
//        System.out.println(str);
//    }
//}
public class Atoi {
    static void implementAtoi(String str){
        int n=str.length();
        int sign=1;
        int i=0;
        int res=0;
        if(str.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while (i<n){
            if(!(str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9)){
                System.out.println(-1);
            }
            else {
                res=res*10+str.charAt(i)-'0';
            }
        }
        System.out.println(res*sign);
    }

    public static void main(String[] args) {
        String str="-123";
        implementAtoi(str);
    }
}