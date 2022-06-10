//import java.util.Stack;
//
//public class LongestValidParentheses {
//    static int longestValid(String s){
//        int n=s.length();
//        int max=0;
//
//        Stack<Integer>st =new Stack<>();
//        st.push(-1);
//        for(int i=0;i<n;i++){
//            char c=s.charAt(i);
//            if(c=='('){
//                st.push(i);
//            }
//            else {
//                st.pop();
//                if(st.empty()){
//                    st.push(i);
//                }else {
//                    int len=i-st.peek();
//                    max=Math.max(len,max);
//                }
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        String str=")()())";
//        System.out.println(longestValid(str));
//    }
//}

public class LongestValidParentheses {
    static int LongestValid(String s){
        int n=s.length();
        int max=0;
        int open=0;
        int close=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else {
                close++;
            }
            if(open==close){
                int len=open+close;
                max=Math.max(len,max);
            }else if (close>open){
                close=open=0;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(s.charAt(j)==')'){
                close++;
            }else {
                open++;
            }
            if (open>close){
                open=close=0;
            }else if (open==close){
                int len=open+close;
                max=Math.max(len,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s=")()())";
        System.out.println(LongestValid(s));
    }
}