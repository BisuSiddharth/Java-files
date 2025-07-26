import java.util.Scanner;

public class St1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = n; i > 0; i--){
        //     for(int j = i; j > 0; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i < n; i++){
        //     System.out.println("*****");
        // }

        // for(int i = 0; i < n ; i = i + 1){
        //     int h = 1;
        //     for(int j = 0; j <= i; j = j + 1){
        //         System.out.print(h++);
        //     }
        //     System.out.println();
        // }

        // int k = 1;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print(k);
        //     }
        //     k++;
        //     System.out.println();
        // }

        // for(int i = n; i > 0; i--){
        //     int k = 1;
        //     for(int j = 0; j < i; j++){
        //         System.out.print(k++);
        //     }
        //     System.out.println();
        // }

        input.close();
    }
}

//     *
//    ***
//   *****
//  *******
// *********    