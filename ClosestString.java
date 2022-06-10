//public class ClosestString {
//    static void minDis(String s,String word1,String word2){
//        String words[]=s.split(" ");
//        int n=words.length;
//        int min_dis=n+1;
//        for(int i=0;i<n;i++){
//            if(words[i].equals(word1)){
//                for(int j=0;j<n;j++){
//                    if(words[j].equals(word2)){
//                        int curr=Math.abs(i-j)-1;
//                        if(curr<min_dis){
//                            min_dis=curr;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(min_dis);
//    }
//
//    public static void main(String[] args) {
//        String s="geeks gor geeks contribute practise";
//        String w1="geeks";
//        String w2="practise";
//        minDis(s,w1,w2);
//    }
//}
public class ClosestString {
    static void minDis(String[]s , String word1, String word2){
        int i1=-1;
        int i2=-1;
        int min_dis=1000000;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(word1)){
                i1=i;
            }
            if(s[i].equals(word2)){
                i2=i;
            }
            if(i1!=-1 && i2!=-1){
                min_dis=Math.min(min_dis,Math.abs(i1-i2)-1);
            }
        }
        System.out.println(min_dis);
    }

    public static void main(String[] args) {
        String[] S = {"the", "quick", "brown", "fox", "quick"};
        String word1="the";
        String word2="fox";
        minDis(S,word1,word2);
    }
}
