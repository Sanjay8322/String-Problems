import java.util.Stack;

public class VaildParentheses {
    static boolean isValid(String str){
        Stack<Character> st =new Stack<>();
        for(char it: str.toCharArray()){
            if(it=='('|| it =='{'|| it=='['){
                st.push(it);
            }
            else {
                if(st.empty()){
                    return false;
                }
                else {
                    char ch=st.pop();
                    if( (it==']'&& ch=='[') || (it==')'&&ch=='(')||(it=='}'&&ch=='{') ){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str="[(])";
        System.out.println(isValid(str));
    }
}