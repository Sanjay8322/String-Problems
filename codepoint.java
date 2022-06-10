public class codepoint {
    static void getCodePOint(String str){
        int res=str.codePointAt(4);
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str="sanjAy";
        getCodePOint(str);
    }
}
