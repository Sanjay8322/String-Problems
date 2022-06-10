public class StringRotated {
    static boolean isRotated(String str1,String str2){
        int len=str2.length();
        if(str1.length()!=str2.length()){
            return false;
        }
        String clock="";
        String antiClock="";
        clock=clock+str2.substring(len-2,len)+str2.substring(0,len-2);
        antiClock=antiClock+str2.substring(2)+str2.substring(0,2);

        if(str1.equals(clock)||str1.equals(antiClock)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="amazon";
        String s2="azonam";
        System.out.println(isRotated(s1,s2));
    }
}