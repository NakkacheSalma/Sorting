public class QuickSort {

    static void quickSort(int[] arr,int start,int end) {
        if(end <= start) {return;} //Stop

        int pivot = partition(arr,start,end);

        // Appliquer QuickSort sur la partie gauche
        quickSort(arr,start,pivot-1);
        // Appliquer QuickSort sur la partie droite
        quickSort(arr,pivot+1,end);


    }
    // Organise les éléments du tableau autour du pivot et return position du pivot
    static int partition(int[] arr,int start,int end) {
        int pivot = arr[end];
        int i = start-1;

        for(int j = start ; j < end ; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[end]; // échange le pivot avec le premier élément plus grand que lui
        arr[end] = temp;

        return i;
    }

        public static void main(String[] args) {
        int[] arr={8,2,5,3,9,4,7,6,1};

        System.out.println("Before sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        quickSort(arr,0,arr.length-1);

        System.out.println("\nAfter sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
