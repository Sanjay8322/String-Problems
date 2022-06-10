//import java.util.Arrays;
//import java.util.Comparator;
//
//public class GroupAnagrams {
//    static class word{
//        String str;
//        int index;
//        word(String str,int index){
//            this.index=index;
//            this.str=str;
//        }
//    }
//    static class DupArray{
//        word[]array;
//        int size;
//        DupArray(String str[],int size){
//            this.size=size;
//            array=new word[size];
//            for(int i=0;i<size;i++){
//                array[i]=new word(str[i],i);
//            }
//        }
//    }
//    static class comp implements Comparator<word>{
//        public int compare(word a,word b){
//            return a.str.compareTo(b.str);
//        }
//    }
//    static void printAnagrams(String org[],int size){
//        DupArray dup=new DupArray(org,size);
//        for(int i=0;i<size;i++){
//            char [] ch=dup.array[i].str.toCharArray();
//            Arrays.sort(ch);
//            dup.array[i].str=new String(ch);
//        }
//        Arrays.sort(dup.array,new comp());
//        for(int i=0;i<size;i++){
//            System.out.println(org[dup.array[i].index]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        String wordArr[]
//                = { "cat", "dog", "tac", "god", "act" };
//        int size = wordArr.length;
//        printAnagrams(wordArr,size);
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    private static ArrayList<ArrayList<String> > anagrams(ArrayList<String> list) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
        for (String str : list) {
            HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                if (tempMap.containsKey(str.charAt(i))) {
                    int x=tempMap.get(str.charAt(i));
                    tempMap.put(str.charAt(i), ++x);
                } else {
                    tempMap.put(str.charAt(i), 1);
                }
            }
            if (map.containsKey(tempMap)) {
                map.get(tempMap).add(str);
            } else {
                ArrayList<String> templ = new ArrayList<String>();
                templ.add(str);
                map.put(tempMap,templ);
            }
        }
        ArrayList<ArrayList<String>> result =new ArrayList<>();
        for(HashMap<Character,Integer> m:map.keySet()){
            result.add(map.get(m));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("ogd");
        list.add("god");
        list.add("atc");
        System.out.println(anagrams(list));
    }
}
