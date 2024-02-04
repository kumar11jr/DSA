public class positionInInfiniteArray {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,24,53,64,75,342};
        int target = 2;
        System.out.println(findPosition(array, target));
        
    }

	private static int findPosition(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end- start+1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]== target) {
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }else{
                start= mid+1;
            }
        } 
        return -1;
    }
}
