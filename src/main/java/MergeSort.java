/*
 It works by recursively dividing the input array into smaller subarrays
 and sorting those subarrays then merging them back together
 to obtain the sorted array.
*/

/*
 It follows the divide-and-conquer approach
*/

public class MergeSort {

    static void mergeSort(int arr[]) {
        int length=arr.length;
        if(length<=1){return;}//STOP

        int mid=length/2;
        int[] left=new int[mid];
        int[] right=new int[length-mid];

        int j=0;
        for(int i=0;i<length;i++){
            if(i<mid){
                left[i]=arr[i];
            }
            else{
                right[j]=arr[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);


    }
    static  void merge(int[] left,int[] right,int[] arr){
        int leftSize=left.length;
        int rightSize=right.length;
        int i=0,l=0,r=0;
        while(l<leftSize && r<rightSize){
            if(left[l]<right[r]){
                arr[i]=left[l];
                i++;
                l++;
            }
            else{
                arr[i]=right[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            arr[i]=left[l];
            i++;
            l++;
        }
        while(r<rightSize){
            arr[i]=right[r];
            i++;
            r++;
        }

    }

    public static void main(String[] args) {
        int[] arr={20,30,5,8,100,3,90,2,30,1};
        System.out.println("Before sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr);
        System.out.println("\nAfter sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
