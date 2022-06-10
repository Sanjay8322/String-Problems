//public class SwappingChar {
//    static void swap(String str){
//        int len=str.length();
//        char temp;
//        char []ch=str.toCharArray();
//        for(int i=0;i<len-1;i+=2){
//            temp=ch[i];
//            ch[i]=ch[i+1];
//            ch[i+1]=temp;
//        }
//        System.out.println(ch);
//    }
//
//    public static void main(String[] args) {
//        String str="sanjay";
//        swap(str);
//    }
//}

public class SwappingChar {
    static void swap(String str){
        int len=str.length();
        StringBuffer sb=new StringBuffer(len);
        for(int i=0;i<len-1;i+=2){
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i));
        }
        if(len%2!=0){
            sb.append(str.charAt(len-1));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s= "sanjay";
        swap(s);
    }
}
