public class EvenWords {
    static void even(String str){
        for( String words : str.split(" ")){
            if(words.length()%2==0){
                System.out.println(words);
            }
        }
    }

    public static void main(String[] args) {
        String str="jay is insane at valorant";
        even(str);
    }
}
