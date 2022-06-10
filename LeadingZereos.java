public class LeadingZereos {
    static void removeZeros(String str){
        int len=str.length();
        int i=0;
        StringBuilder sb=new StringBuilder(str);
        while (i<len&& str.charAt(i)=='0') {
            i++;
        }
        sb.replace(0, i, "");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str= "00012345";
        removeZeros(str);
    }
}
