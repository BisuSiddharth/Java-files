import java.util.*;

public class Mt1{

    Scanner input = new Scanner(System.in);

    void display(int[][] arr){
        System.out.println("Printing an Array >> ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] getArray(int m, int n)
    {
        int[][] arr = new int[m][n];
        System.out.println("Enter Array of " + m + " * " + n + " >>");
        for(int i = 0; i < m; i++)
        {
            System.out.println("Enter " + (i + 1) + "th row >> ");
            for(int j = 0; j < n; j++)
            {
                int x = input.nextInt();
                arr[i][j] = x;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        // int[][] arr = {{1, 2}, {3, 4}};

        Mt1 obj = new Mt1();
        // obj.display(arr);

        int[][] arr1 = obj.getArray(2, 3);

        int[][] arr2 = obj.getArray(3,1);

        obj.display(arr1); 
        obj.display(arr2); 
    }
}


