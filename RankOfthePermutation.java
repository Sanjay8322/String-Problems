//public class RankOfthePermutation {
//    static int fact(int n){
//        return (n<=1)?1:n*fact(n-1);
//    }
//    static int rightSmall(String str,int low,int high){
//        int countright=0;
//        int i;
//        for(i=low+1;i<=high;i++){
//            if(str.charAt(i)<str.charAt(low))
//                countright++;
//        }
//        return countright;
//    }
//    static void rank(String str){
//        int n=str.length();
//        int mul=fact(n);
//        int rank=1;
//        int countright;
//        for(int i=0;i<n;i++){
//            mul/=n-i;
//            countright=rightSmall(str,i,n-1);
//            rank+=countright*mul;
//        }
//        System.out.println(rank);
//    }
//
//    public static void main(String[] args) {
//        String str="string";
//        rank(str);
//    }
//}

public class RankOfthePermutation {
    static final int size=256;
    static int fact(int n){
        return (n<=1)?1:n*fact(n-1);
    }
    static void updateCount(char[]str,int count[]){
        int i;
        for( i=0;i< str.length;i++){
            count[str[i]]++;
        }
        for(i=1;i<size;i++){
            count[i]+=count[i-1];
        }
    }
    static void updateAfter(int count[],char ch){
        for(int i=ch;i<size;i++){
            count[i]--;
        }
    }
static int findrank(char[]s){
        int len=s.length;
        int mul=fact(len);
        int rank=1;
        int count[]=new int[size];
        updateCount(s,count);
        for(int i=0;i<s.length;i++){
            mul/=len-i;
            rank+=count[s[i]-1]*mul;
            updateAfter(count,s[i]);
        }
        return rank;
    }

    public static void main(String[] args) {
        String str="string";
        char[]s=str.toCharArray();
        System.out.println(findrank(s));
    }
}