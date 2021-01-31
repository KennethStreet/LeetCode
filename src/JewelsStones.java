import java.util.HashMap;

public class JewelsStones {
    public static void main(String args[]){

        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    //Use of HashMap to Increase Time Complexity but Reduce Space Complexity
    //Time Complexity - O(n) because we are iterating through two different lists but they are not being iterated through at the same time.
    //Space Complexity - O(n) because we are using a HashMap so it is O(n) n being the size of the HashMap
    public static int numJewelsInStones(String jewels, String stones){
        int jewelCount = 0;
        HashMap<Character, Integer> jewelInStones = new HashMap<Character, Integer>();

        for (int i = 0; i < jewels.length(); i++)
        {
            jewelInStones.put(jewels.charAt(i), jewelCount);
        }

        for(int j = 0; j < stones.length(); j++){
            if(jewelInStones.containsKey(stones.charAt(j)))
            {
                jewelInStones.put(stones.charAt(j), jewelInStones.get(stones.charAt(j)) + 1);
                jewelCount++;
            }
        }

        return jewelCount;
    }


    //Time Complexity - O(mn) because it's two different lists of varying length
    //Space Complexity - O(1) because there are no recursive functions adding to the call stack and hash tables
//    public static int numJewelsInStones(String jewels, String stones){
//        int jewelCount = 0;
//
//        for (int i = 0; i < jewels.length(); i++)
//        {
//            for(int j = 0; j < stones.length(); j++){
//                if(stones.charAt(j) == jewels.charAt(i))
//                {
//                    jewelCount++;
//                }
//            }
//        }
//
//        return jewelCount;
//    }
}
