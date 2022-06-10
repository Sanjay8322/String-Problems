import java.util.ArrayList;
import java.util.List;

public class Zalgorithm {
    static int[] calculateZ(char input[]){
        int z[]=new int[input.length];
        int right=0;
        int left=0;
        for(int k=1;k<input.length;k++){
            if(k>right){
                right=left=k;
                while (right<input.length && input[right]==input[right-left]){
                    right++;
                }
                z[k]=right-left;
                right--;
            }else {
                int k1=k-left;
                if(z[k1]<right-k+1){
                    z[k]=z[k1];
                }else {
                    left=k;
                    while (right<input.length && input[right]==input[right-left]){
                        right++;
                    }
                    z[k]=right-left;
                    right--;
                }
            }
        }
        return z;
    }
    static List<Integer> match(char pat[],char text[]){
        char newString[]=new char[pat.length+ text.length+1];
        int i=0;
        for(char c:pat){
            newString[i]=c;
            i++;
        }
        newString[i]='$';
        i++;
        for(char c: text){
            newString[i]=c;
            i++;
        }
        List<Integer> res = new ArrayList<>();
        int z[]=calculateZ(newString);
        for(int j=0;j<z.length;j++){
            if(z[j]== pat.length){
                res.add(j- pat.length-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char text[]="batmanandrobinarebat".toCharArray();
        char pat[]="bat".toCharArray();
        System.out.println(match(pat,text));
    }
}

