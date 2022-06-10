//public class Pangram {
//    static final int size=26;
//    static boolean isLetter(char ch){
//        if(!Character.isLetter(ch)){
//            return false;
//        }
//        return true;
//    }
//    static boolean allLetter(String str){
//        int len=str.length();
//        boolean present[]=new boolean[size];
//        for(int i=0;i<len;i++){
//            if(isLetter(str.charAt(i))){
//                int ind = str.charAt(i)-'a';
//                present[ind]=true;
//            }
//        }
//        for(int i=0;i<size;i++){
//            if(!present[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String str= "abcdefghijklmnopqrstuvwxyz";
//        System.out.println(allLetter(str));
//    }
//}

public class Pangram {
    static void isPangram(String str){
        int len=str.length();
        boolean present=true;
        for(char ch='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                present=false;
                break;
            }
        }
        if(present){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        isPangram(str);
    }
}
