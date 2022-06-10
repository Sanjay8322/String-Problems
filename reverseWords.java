//public class reverseWords {
//    static void reverseWords(String s[]){
//        String nstr="";
//        int len=s.length;
//        for(int i=len-1;i>=0;i--){
//            nstr+=s[i]+" ";
//        }
//        System.out.println(nstr);
//    }
//
//    public static void main(String[] args) {
//        String s[]="i like much".split( " ");
//        reverseWords(s);
//    }
//}
//public class reverseWords {
//    static void reverse(String str,String res){
//        int n=str.length();
////        String res;
//        int i=0;
//        while (i<n){
//            while (i<n&& str.charAt(i)==' '){
//                i++;
//            }
//            int j=i+1;
//            while (j<n && str.charAt(j)!=' '){
//                j++;
//            }
//            String sub=str.substring(i,j);
//            if(res.length()==0){
//                res=sub;
//            }else{
//                res=sub+" "+res;
//            }
//            i=j+1;
//        }
//        System.out.println(res);
//    }
//
//    public static void main(String[] args) {
//        String s = "i like this program very much ";
//        String re="";
//        reverse(s,re);
//    }
//}
public class reverseWords {
    static void reverse(String str[]){
        int n=str.length;
        String nstr="";
        for(int i=n-1;i>=0;i--){
            nstr+=str[i]+" ";
        }
        System.out.println(nstr);
    }

    public static void main(String[] args) {
        String str[]="i like this program very much ".split(" ");
        reverse(str);

    }
}