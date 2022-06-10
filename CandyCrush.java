import java.util.Stack;

public class CandyCrush {
    static class Pair{
        int ctr;
        char c;
        Pair(char c,int ctr){
            this.ctr=ctr;
            this.c=c;
        }
    }
    static String reducedString(int k,String str){
        if(k==1){
            return "";
        }
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.size()==0){
                st.push(new Pair(str.charAt(i),1));
                continue; //impppp
            }
            if(st.peek().c==str.charAt(i)){
                Pair p=st.peek();
                st.pop();
                p.ctr+=1;
                if(p.ctr==k){
                    continue;
                }else {
                    st.push(p);
                }
            }else {
                st.push(new Pair(str.charAt(i),1));
            }
        }
        String res="";
        while (st.size()>0){
            int ctr=st.peek().ctr;
            char c=st.peek().c;
            while (ctr-->0){
                res=c+res;
            }
            st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        int k=2;
        String ans=reducedString(k,str);
        System.out.println(ans);
    }
}