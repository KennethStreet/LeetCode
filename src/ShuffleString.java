import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShuffleString {

    public static void main(String args[]){

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    //SLOW
    //
    public static String restoreString(String s, int[] indices){

        HashMap<Integer, Character> map = new HashMap<Integer, Character>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }

        SortedSet<Integer> keys = new TreeSet<>(map.keySet());

        for(int key: keys){
            sb.append(map.get(key));
        }

        return sb.toString();
    }
}
