import java.util.Arrays;
import java.util.List;

public class LargestWordInDict {
    static boolean isSubsequence(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int i=0;
        for(int j=0;j<n&&i<m;j++){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
            }
        }
        if(i!=m){
            return false;
        }
        return true;
    }
    static void longestString(List<String> dict, String str){
//        dict.sort((String a,String b)->a.length()==b.length()?a.compareTo(b):b.length()-a.length());
        int length=0;
        String res="";
        for(String word:dict){
            if(word.length()>length&&isSubsequence(word,str)){
                res=word;
                length=word.length();
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String[] s= {"ale","apple","monkey","plea"};
        List<String>dict = Arrays.asList(s);
        String str="abpcplea";
        longestString(dict,str);
    }
}
