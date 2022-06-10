import java.util.HashMap;
import java.util.Map;

public class SmallestWindowString {
    static String smallestWindow(String s,String t){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res[]={-1,0,0};
        int l=0;
        int r=0;
        int expected=0;
        int required=map.size();
        Map<Character,Integer> map2= new HashMap<>();
        while (r<s.length()){
            char ch=s.charAt(r);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(map.containsKey(ch)&& map2.get(ch)==map.get(ch)){
                expected++;
            }
            while (l<r && expected==required){
                if(res[0]==-1 || res[0]>(r-l)+1){
                    res[0]=(r-l)+1;
                    res[1]=l;
                    res[2]=r;
                }
                ch=s.charAt(l);
                map2.put(ch,map2.get(ch)-1);
                if(map.containsKey(ch)&&map2.get(ch)<map.get(ch)){
                    expected--;
                }
                l++;
            }
            r++;
        }
        return res[0]==-1?null: s.substring(res[1],res[2]+1);
    }

    public static void main(String[] args) {
        String str="ABBAACCDBCAB";
        String str2="ABC";
        System.out.println(smallestWindow(str,str2));
    }
}

