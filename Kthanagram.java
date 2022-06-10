//public class Kthanagram {
//    static final int size=256;
//    static boolean kAna(String s,String t,int k){
//        int n=s.length();
//        int count=0;
//        if(t.length()!=n){
//            return false;
//        }
//        int count1[]=new int[size];
//        int count2[]=new int[size];
//        for(int i=0;i<n;i++){
//            count1[s.charAt(i)]++;
//            count2[s.charAt(i)]++;
//        }
//        for(int i=0;i<size;i++){
//            if(count1[i]>count2[i]){
//                count=count+Math.abs(count1[i]-count2[i]);
//            }
//        }
//        if(count<=k){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String str1="anagram";
//        String str2="grammar";
//        System.out.println(kAna(str1,str2,3));
//    }
//}
//public class Kthanagram {
//    static  final int size=26;
//    static boolean ana(String str1,String str2,int k){
//        int n=str1.length();
//        int count=0;
//        if(str2.length()!=n){
//            return false;
//        }
//        int hash[]=new int[size];
//        for(int i=0;i<n;i++){
//            hash[str1.charAt(i)-'a']++;
//        }
//        for(int i=0;i<n;i++){
//            if(hash[str2.charAt(i)-'a']>0){
//                hash[str2.charAt(i)-'a']--;
//            }else{
//                count++;
//            }
//            if(count>k){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String s="anagram";
//        String t="grammar";
//        int k=3;
//        System.out.println(ana(s,t,k));
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kthanagram {
    static boolean ana(String s,String t,int k){
        int n=s.length();
        if(t.length()!=n){
            return false;
        }
        List<Character> l =new ArrayList<>();
        char[]c1=s.toCharArray();
        char[]c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]){
                l.add(c1[i]);
            }
        }
        if(l.size()>k){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="anagram";
        String str2="grammar";
        int k=3;
        System.out.println(ana(str1,str2,k));
    }
}