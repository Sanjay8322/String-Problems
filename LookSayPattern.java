//public class LookSayPattern {
//    static String countSay(int n){
//        if(n==1){
//            return "1";
//        }
//        String val="1";
//        for(int i=1;i<n;i++){
//            char c =val.charAt(0);
//            int count=1;
//            StringBuilder sb=new StringBuilder();
//            for(int j=1;j<val.length();j++){
//                if(c!=val.charAt(j)){
//                    sb.append(count);
//                    sb.append(c);
//                    count=1;
//                    c=val.charAt(j);
//                }
//                else {
//                    count++;
//                }
//            }
//            sb.append(count);
//            sb.append(c);
//            val=sb.toString();
//        }
//        return val;
//    }
//
//    public static void main(String[] args) {
//        int n=3;
//        System.out.println(countSay(5));
//    }
//}
public class LookSayPattern {
    static String countSay(int n){
        if(n==1){
            return "1";
        }
        String s=countSay(n-1); //count(2) there are 2 digits in string
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(s.charAt(i));
                count=1;
            }
        }
        sb.append(count);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(countSay(n));
    }
}