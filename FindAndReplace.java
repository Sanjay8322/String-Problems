import java.util.HashMap;
import java.util.Map;

public class FindAndReplace {
    static String findReplace(String s,int[]indices,String[]source,String[]target){
        Map<Integer,Integer> map=new HashMap<>();
        StringBuilder res= new StringBuilder();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],i);
        }
        for(int i=0;i<s.length();i++){

            if(!map.containsKey(i)){
                res.append(s.charAt(i));
                continue;
            }
            int index=map.get(i);
            String substr=s.substring(i,i+source[index].length());
            if(substr.equals(source[index])){
                res.append(target[index]);
            }
            else {
                res.append(substr);
            }
            i+=(source[index].length()-1);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str="abcd";
        int[]indices={0,2};
        String []sources={"a","cd"};
        String[] target={"eee","ffff"};
        System.out.println(findReplace(str,indices,sources,target));
    }

}
