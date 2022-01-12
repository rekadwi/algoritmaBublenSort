class LiveBubbleSort {
public static void main(String[] args) {
int[] arr = {3, 2, 7, 9};
LiveBubbleSort bubblesort = new LiveBubbleSort();
bubblesort.sort(arr);
bubblesort.printArr(arr);
}
void sort(int[] arr){
    int arrlen = arr.length;
    boolean isSorted = false;

    for (int i = 0; i < arrlen - 1 && !isSorted; i++){
        isSorted = true;

    for (int j = 0; j < arrlen - i - 1; j++){
        if (arr[j] > arr[j + 1]) {
            isSorted = false;
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;//o(n)kuadarat melakukan intrasi dalam interasi
        }   
    }  
    
    }
} 
void printArr( int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        {
            //System.out.print();
        }
        

        }
                
    }

}