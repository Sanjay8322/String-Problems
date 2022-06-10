//public class Compare {
//    static int compare(String str1,String str2){
//        int l1=str1.length();
//        int l2=str2.length();
//        int min=Math.min(l1,l2);
//        for(int i=0;i<min;i++){
//            int str1Ch=(int)str1.charAt(i);
//            int str2Ch=(int)str2.charAt(i);
//            if(str1Ch!=str2Ch){
//                return str1Ch-str2Ch;
//            }
//        }
////        if(l1!=l2){
////            return l1-l2;
////        }
////        else {
////            return 0;
////        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        String str1="GeeksForGeeks";
//        String str2="Practise";
//        System.out.println(compare(str1,str2));
//    }
//}

import java.util.Objects;

//public class Compare {
//    static void compare(String str1,String str2){
//        System.out.println(str1.equalsIgnoreCase(str2));
//    }
//
//    public static void main(String[] args) {
//        String str1="jay";
//        String str2="Jay";
//        compare(str1,str2);
//    }
//}
//public class Compare {
//    static void compareTo(String str1,String str2){
//        System.out.println(str1.compareTo(str2));
//    }
//
//    public static void main(String[] args) {
//        String str1="jay";
//        String str2="won";
//        compareTo(str1,str2);
//    }
//}
public class Compare {
    static void compareTo(String str1,String str2){
        System.out.println(Objects.equals(str1,str2));
    }

    public static void main(String[] args) {
        String str1="jay";
        String str2="won";
        compareTo(str1,str2);
    }
}