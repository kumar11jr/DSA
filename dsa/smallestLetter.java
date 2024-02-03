public class smallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return letters[start%n];
    }
}
