//public class equalPoint {
//    static void index(String s){
//        int len=s.length();
//        int open[]=new int[len+1];
//        int close[]=new int[len+1];
//        open[0]=0;
//        close[len]=0;
//        if(s.charAt(0)=='('){
//            open[1]=1;
//        }
//        if(s.charAt(len-1)==')'){
//            close[len-1]=1;
//        }
//        for(int i=1;i<len;i++){
//            if(s.charAt(i)=='('){
//                open[i+1]=open[i]+1;
//            }else {
//                open[i+1]=open[i];
//            }
//        }
//        for(int i=len-2;i>=0;i--){
//            if(s.charAt(i)==')'){
//                close[i]=close[i+1]+1;
//            }else{
//                close[i]=close[i+1];
//            }
//        }
//        for(int i=0;i<=len;i++){
//            if(open[i]==close[i]){
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "(()))(()()())))";
//        index(str);
//    }
//}
public class equalPoint {
    static void index(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==')'){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(count==i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String str="((())()()))()()";
        index(str);
    }
}