public class St2{
    public static void main(String[] args){
        String[] arr = {"Volvo", "Maruti", "Hans Wilsmith", "Chandragupt"};
        System.out.println(arr[0]);
        arr[0] = "Aerohub";
        System.out.println(arr[0]);

        int[] arr_ = {0, 8 , 4, -2, -5, 7, 2, -10, 6};
        int sum_p = 0, sum = 0;
        for(int k: arr_){
            sum = sum + k;
            if(k > 0) sum_p = sum_p + k;
        }

        System.out.println("Sum of positives = " + sum_p);
        System.out.println("Sum = " + sum);
    }
}