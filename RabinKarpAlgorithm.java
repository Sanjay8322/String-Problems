//public class RabinKarpAlgorithm {
//    static void search(String txt,String pat){
//        int m=pat.length();
//        int n=txt.length();
//        for(int i=0;i<=n-m;i++){
//            int j;
//            for(j=0;j<m;j++)
//                if (txt.charAt(i+j)!=pat.charAt(j))
//                    break;
//                if(j==m)
//                    System.out.println("found at index : "+i);
//        }
//    }
//
//    public static void main(String[] args) {
//        String txt = "AABAACAADAABAAABAA";
//        String pat = "AABA";
//        search(txt,pat);
//    }
//}

//public class RabinKarpAlgorithm {
//    static final int d=26;
//    static final int p=5381;
//    static void search(String txt,String pat){
//        int textHash=0;
//        int patHash=0;
//        for(int i=0;i<pat.length();i++){
//            textHash=textHash*d;
//            patHash=patHash*d;
//            textHash=textHash+((txt.charAt(i)-'A'+1));
//            patHash=patHash+((pat.charAt(i)-'A'+1));
//        }
//        for(int i=0;i<=txt.length()-pat.length();i++){
//            if(textHash==patHash)
//                System.out.println("found at index : "+i);
//            if(i<txt.length()-pat.length()){
//                textHash=textHash-((txt.charAt(i)-'A'+1)*(int) Math.pow(d,pat.length()-1));
//                textHash=textHash*d + (txt.charAt(i+pat.length())-'A'+1);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String txt="AABAACAADAABAAABAA";
//        String pat="AABA";
//        search(txt,pat);
//    }
//}

public class RabinKarpAlgorithm {
    static final int d=26;
    static final int p=5381;
    static  void search(String text,String pat){
        int textHash=0;
        int patHash=0;
        for(int i=0;i<pat.length();i++){
            textHash=textHash*d;
            patHash=patHash*d;
            textHash=textHash+((text.charAt(i)-'A'+1)%p);
            patHash=patHash + ((pat.charAt(i)-'A'+1)%p);
        }
        for(int i=0;i<=text.length()-pat.length();i++){
            if(textHash==patHash){
                System.out.println("found at index: "+i);
            }
            if(i<text.length()-pat.length()){
                textHash=textHash-((text.charAt(i)-'A'+1)*(int) Math.pow(d,pat.length()-1));
                textHash=textHash*d + (text.charAt(i+pat.length())-'A'+1);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt,pat);
    }
}


