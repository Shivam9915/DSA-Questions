public class BubbleSort{
    public static void bubbleSorting(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
              if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
              }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,4,2,3,1};
        System.out.println("The array after sorted are :");
        bubbleSorting(arr);
        for(int elem:arr){
            System.out.println(elem);
        }
        
    }

}