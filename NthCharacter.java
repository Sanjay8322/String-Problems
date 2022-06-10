public class NthCharacter {
    static char nthCharacter(String str,int r,int n){
        String temp="";
        for(int i=0;i<r;i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    temp+="10";
                }else {
                    temp+="01";
                }
            }
            str=temp;
            temp="";
        }
        return  str.charAt(n);
    }

    public static void main(String[] args) {
        String str="11";
        int r=1;
        int n=3;
        System.out.println(nthCharacter(str,r,n));
    }
}