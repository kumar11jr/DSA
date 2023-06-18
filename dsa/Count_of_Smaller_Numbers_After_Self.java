import java.util.ArrayList;
public class Count_of_Smaller_Numbers_After_Self {
    public static ArrayList<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            list.add(count);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        ArrayList<Integer> list = countSmaller(nums);
        System.out.println(list);
    }
}