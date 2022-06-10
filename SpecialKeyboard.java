//public class SpecialKeyboard {
//    static int optimal(int n){
//        if(n<=6){
//            return n;
//        }
//        int i;
//        int max=0;
//        for(i=n-3;i>=1;i--){
//            int curr=(n-i-1)*optimal(i);
//            if(curr>max){
//                max=curr;
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int n=10;
//        for(int i=1;i<=n;i++){
//            System.out.println(optimal(i));
//        }
//    }
//}

public class SpecialKeyboard {
    static int optimal(int n){
        if(n<=6){
            return n;
        }
        int screen[]=new int[n];
        for(int i=1;i<=6;i++){
            screen[i-1]=i;
        }
        for(int i=7;i<=n;i++){
            screen[i-1]=0;
            for(int j=i-3;j>=1;j--){
                int curr= (i-j-1)*screen[j-1];
                if(curr>screen[i-1]){
                    screen[i-1]=curr;
                }
            }
        }
        return screen[n-1];
    }

    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.println(optimal(i));
        }
    }
}