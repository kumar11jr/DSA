public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; 
        }

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; 
                }
            }

            if (j == needleLength) {
                return i; 
            }
        }

        return -1; 
    }
    public static int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
        System.out.println(strStr1(haystack,needle));
    }
    
}
