public class CountSubstringKdistinct {
    static int atmostK(String str,int k){
        int n=str.length();
        int i=0;
        int j=0;
        int res=0;
        int count=0;
        int m[]=new int[26];
        while (j<n){
            m[(int) str.charAt(j)-'a']++;
            if(m[(int) str.charAt(j)-'a']==1){
                count++;
            }
            while (count>k){
                m[(int) str.charAt(i)-'a']--;
                if(m[(int) str.charAt(i)-'a']==0){
                    count--;
                }
                i++;
            }
            res+=(j-i+1);
            j++;
        }
        return res;
    }
    static int totalSubstrings(String s,int k){
        return atmostK(s,k)-atmostK(s,k-1);
    }

    public static void main(String[] args) {
        String str="aba";
        int k=2;
        System.out.println(totalSubstrings(str,k));
    }
}