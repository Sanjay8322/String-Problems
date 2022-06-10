//public class reverseString {
//    public static void main(String[] args) {
//        String str = " Sanjay";
//        char[]ch=str.toCharArray();
//        for(int i=ch.length-1;i>=0;i--){
//            System.out.print(ch[i]);
//        }
//    }
//}

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String str="sanjay";
        char[] ch= new char[str.length()];
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            ch[i]=s.pop();
        }
        System.out.println(ch);
    }
}