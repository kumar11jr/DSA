public class Sorting {
    public static int[] insertionSort(int[] arr){
      for (int index = 0; index < arr.length; index++) {
        int key = arr[index];
        int j=index-1;
        while (j>=0 && arr[j]>key) {
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
      }
      return arr;
    }
  
    public static int[] SelectionSort(int[] arr){
      for (int index = 0; index < arr.length; index++) {
        int min = index;
        for (int j = index+1; j < arr.length; j++) {
            if (arr[j]<arr[min]) {
              min = j;
            }
          }
          int temp = arr[index];
          arr[index] = arr[min];
          arr[min] = temp;
        }
        return arr;
      }
    
    public static void main(String[] args) {
      int[] arr = {2,1,4,3,7,5};
      SelectionSort(arr);
      for(int i:arr){
        System.out.print(i+" ");
      }
    }
  }