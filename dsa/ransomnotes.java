public class ransomnotes {
    public static boolean contains(String notes,String mazagine){
        if (mazagine.contains(notes)) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        String notes = "a";
        String mazagine = "aab";

        System.out.println(contains(notes,mazagine));
    }
}
