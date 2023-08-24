public class DeleteColToMakeSorted {
    public static int minDeletionSize(String[] str){
        if (str.length == 0) return -1;
        int deleted = 0;
        int digits = str[0].length();
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < digits; j++) {
                if(str[j].charAt(i) < str[j-1].charAt(i)){
                    deleted++;
                    break;
                }
            }
        }

        return deleted;
    }
    public static void main(String[] args) {
        String[] str = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(str));
        
    }
}
