public class InsertionSort {
    public static void insertionSort(int arr []){
       for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;

        }
        arr[j+1]=current;

       }
       for(int keys:arr){
        System.out.print(keys+" ");
    }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,4,5,2,1,6};
        insertionSort(arr);
    }
    
}
