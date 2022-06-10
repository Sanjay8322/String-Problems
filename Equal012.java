import java.util.HashMap;
import java.util.Map;

public class Equal012 {
    static int equal(String str){
        int ans=0;
        Map<String,Integer> map=new HashMap<>();
        int zc=0;
        int tc=0;
        int oc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                zc++;
            }else if(str.charAt(i)=='1'){
                oc++;
            }else {
                tc++;
            }
            String key=(zc-oc)+"*"+(zc-tc);
            if(!map.containsKey(key)){
                ans=ans+0;
            }else{
                ans=ans+map.get(key);
            }
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="0102010";
        System.out.println(equal(str));
    }
}