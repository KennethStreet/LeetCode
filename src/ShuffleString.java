public class ShuffleString {

    public static void main(String args[]){

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    //FASTER BUT STILL SLOW
    public static String restoreString(String s, int[] indices){

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        int stringCounter = 0;

        while (counter != indices.length){
            for(int index: indices){
                if(index == counter){
                    sb.append(s.charAt(stringCounter));
                    counter++;
                }
                stringCounter++;
            }
            stringCounter = 0;
        }

        return sb.toString();
    }

    //SLOW
    //
//    public static String restoreString(String s, int[] indices){
//
//        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i < indices.length; i++){
//            map.put(indices[i], s.charAt(i));
//        }
//
//        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
//
//        for(int key: keys){
//            sb.append(map.get(key));
//        }
//
//        return sb.toString();
//    }
}
