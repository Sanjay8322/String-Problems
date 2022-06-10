public class charAt {
    public static void main(String[] args) {
        String str = "sanjay";
        char ch = 's';
        StringBuffer s = new StringBuffer(str);
        s.setCharAt(5, ch);
        System.out.println(s);
    }
}