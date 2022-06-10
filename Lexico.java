//public class Lexico {
//    static void compare(String str1,String str2){
//        System.out.println(str1.compareTo(str2));
//    }
//
//    public static void main(String[] args) {
//        String str1="ram";
//        String str2="shyam";
//        compare(str1,str2);
//    }
//}

public class Lexico {
    static int compare(String str1,String str2){
        for(int i=0;i<str1.length()&&i<str2.length();i++){
            if((int)str1.charAt(i)==(int)str2.charAt(i)){
                continue;
            }
            else{
                return (int)str1.charAt(i)-(int)str2.charAt(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String str1="ram";
        String str2="shyam";
        System.out.println(compare(str1,str2));
    }
}