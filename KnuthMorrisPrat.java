public class KnuthMorrisPrat {
    static void computeLpsArray(String pat,int m,int lps[]){
        int len=0;
        int i=1;
        lps[0]=0;
        while (i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else {
                if(len!=0)
                    len=lps[i-1];
                else
                    lps[i]=len;
                    i++;
            }
        }
    }
    static void kmp(String txt,String pat,int m,int n){
        m=pat.length();
        n=txt.length();
        int lps[]=new int[m];
        computeLpsArray(pat,m,lps);
        int i=0;
        int j=0;
        while (i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("found at index "+(i-j));
                j=lps[j-1];
            }
            else if (i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else {
                    i=i+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "abxabcabcaby";
        String pat = "abcaby";
        int m=pat.length();
        int n=txt.length();
        kmp(txt,pat,m,n);
    }
}
