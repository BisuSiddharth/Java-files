public class St3 {

    void display(int[] arr){
        if(arr == null){
            System.out.println("Array is null");
            return;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    void d0(int arr[]){
        System.out.println("0th element = " + arr[0]);
    }

    boolean BS(int target, int[] arr){
        int left = 0;
        int right = arr.length;
        int mid = (left + right) / 2;

        if(target == arr[left] || target == arr[right - 1]){
            return true;
        }
        while(left <= right){

            if(target == arr[mid]){
                return true;
            }

            else if(target > arr[mid]){
                left = mid;
            }
            else if(target < arr[mid]){
                right = mid;
            }
            mid = (left + right) / 2;
        }
        return false;
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }

    void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        St3 obj = new St3();
        obj.display(arr);
        obj.d0(arr);

        if(obj.BS(50, arr)){ 
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        int array[] = {-3, 4, 6, 1, -9, 6, 8}; 

        obj.display(array);
        System.out.println("After Sorting Array--->");
        obj.bubbleSort(array);
        obj.display(array);
    }
}
