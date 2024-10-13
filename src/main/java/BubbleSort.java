public class BubbleSort {
    static void bubbleSort(int arr[], int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    static void printTable(int arr[], int n){
        int i;
        System.out.println("Array:");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

    }
    public static void main(String[] args) {
        int arr[]={300,40,23,45,9,100};
        int n=arr.length;
        printTable(arr,n);
        bubbleSort(arr,n);
        printTable(arr,n);
    }
}
