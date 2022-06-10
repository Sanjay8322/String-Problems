public class LongestCommonPrefix {
    static String commonPrefixtill(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        String res="";
        for(int i=0,j=0;i<n1&&j<n2;i++,j++){
            if(str1.charAt(i)!=str2.charAt(j)){
                break;
            }
            res+=str1.charAt(i);
        }
        return res;
    }
    static String commonp(String arr[]){
        int n= arr.length;
        String prefix=arr[0];
        for(int i=1;i<n;i++){
            prefix=commonPrefixtill(prefix,arr[i]);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        int n = arr.length;

        String ans = commonp(arr);
        System.out.println(ans);

    }

}
