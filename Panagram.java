public class Panagram {
    static int isPanagram(String str){
        int n=str.length();
        int index=-1;
        boolean mark[]=new boolean[26];
        for(int i=0;i<n;i++){
            if('A'<=str.charAt(i)&& str.charAt(i)<='Z'){
                index=str.charAt(i)-'A';
            }else if ('a'<= str.charAt(i)&& str.charAt(i)<='z'){
                index=str.charAt(i)-'a';
            }else {
                continue;
            }
            mark[index]=true;
        }
        for(int i=0;i<26;i++){
            if(mark[i]==false){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(str));
    }
}
