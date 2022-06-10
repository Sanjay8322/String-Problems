public class ExcelSheet1 {
    static String colTitle(int n){
        String res="";
        while (n!=0){
            char c=(char)((n-1)%26 + 'A');
            res=c+res;
            n=(n-1)/26;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=51;
        System.out.println(colTitle(n));
    }
}
