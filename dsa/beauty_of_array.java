public class beauty_of_array {
    public static int beauty(int[] a,int n){
        int[] min_right = new int[n];

    min_right[n - 1] = a[n - 1];

    for (int i = n - 2; i >= 2; i--)
    {
        min_right[i] = Math.min(min_right[i + 1], a[i]);
    }

    int max_left = a[0];

    int ans = 0;

    for (int i = 1; i < n - 1; i++)
    {
        if (a[i] > max_left && a[i] < min_right[i + 1])
            ans += 2;
        else if (a[i] > a[i - 1] && a[i] < a[i + 1])
            ans += 1;

        max_left = Math.max(a[i], max_left);
    }

    return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(beauty(nums,nums.length));
    }
}
