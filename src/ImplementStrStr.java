public class ImplementStrStr {
    public static void main(String args[]){
        String haystack = "aaaaa";
        String needle = "bba";

        strStr(haystack, needle);
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        }

        if(needle.length() > haystack.length()) {
            return -1;
        }

        int foo = -1;

        for(int i = 0; i < haystack.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i) == needle.charAt(j)) {
                    if(haystack.length() - i < needle.length()) {
                        return foo;
                    }else {
                        if(haystack.substring(i, i + needle.length()).equals(needle)) {
                            return i;
                        }
                    }
                }
            }
        }

        return foo;
    }
}
