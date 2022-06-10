import java.util.Arrays;

public class AllPermutations {
    static void swap(char str[],int i,int j){
            char t=str[i];
            str[i]=str[j];
            str[j]=t;
    }
    static void reverse(char str[],int i,int j){
        while (i<j){
            swap(str,i,j);
            i++;
            j--;
        }
    }
    static int ceilIndex(char[]str,char first,int i,int j){
        int ceilIndex=i;
        for(int l=i+1;l<=j;l++){
            if(str[l]>first && str[l]<str[ceilIndex])
                ceilIndex=l;
        }
        return ceilIndex;
    }
    static void sortedPermutations(char[] str,char[]str2){
        int n=str.length;
        Arrays.sort(str);
        int count=0;
        boolean isFinished=false;
        while (!isFinished){

            count++;
            System.out.println(str);



            int i;
            for(i=n-2;i>=0;i--){
                if(str[i]<str[i+1])
                    break;
            }
            if(i==-1){
                isFinished=true;
            }
            else{
                int ceilIndex=ceilIndex(str,str[i],i+1,n-1);
                swap(str,i,ceilIndex);
                reverse(str,i+1,n-1);
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        char str[] = "abc".toCharArray();
        char[]str2="acb".toCharArray();
        sortedPermutations(str,str2);
    }
}