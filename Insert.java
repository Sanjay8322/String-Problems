//public class Insert {
//    static void insertString(String original,String stringtoInsert,int index){
//        String newString="" ;
//        for(int i=0;i<original.length();i++){
//            if(i==index){
//                newString+=stringtoInsert;
//            }
//            newString+=original.charAt(i);
//
//        }
//        System.out.println(newString);
//    }
//
//    public static void main(String[] args) {
//        String original="say";
//        String to="nja";
//        int index=2;
//        insertString(original,to,index);
//    }
//}

//public class Insert {
//    static void insertString(String original,String toBeInsert,int index){
//        String newString="";
//        newString=original.substring(0,index+1)+toBeInsert+original.substring(index+1);
//        System.out.println(newString);
//    }
//
//    public static void main(String[] args) {
//        String str="say";
//        String to ="nja";
//        insertString(str,to,1);
//    }
//}
public class Insert {
    static void insertString(String original,String toInsert,int index){
        StringBuilder sb= new StringBuilder(original);
        sb.insert(index+1,toInsert);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str="say";
        String to="nja";
        insertString(str,to,1);
    }
}