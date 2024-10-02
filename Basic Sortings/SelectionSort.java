// The idea behind the selection sort is that we pick salllest element 
// from unsorted array and put it at the beginning of the array.

public class SelectionSort {
    public static void selectionSort(int arr []){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int keys:arr){
            System.out.print(keys+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2}; 
        selectionSort(arr);

    }
    
}
