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

    int[][] getMans(int[][] arr1, int[][] arr2){
        int x = arr1.length;
        int y1 = arr1[0].length;
        int y2 = arr2.length;
        int z = arr2[0].length;

        if(y1 != y2) return null;

        int v[][] = new int[x][z];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < z; j++){
                v[i][j] = 0;

                for(int k = 0; k < y1; k++){
                    v[i][j] += arr1[i][k] * arr2[k][j]; 
                }
            }
        }
        return v;
    }

    public static void main(String[] args){
        // int[][] arr = {{1, 2}, {3, 4}};

        Mt1 obj = new Mt1();
        // obj.display(arr);

        int[][] arr1 = obj.getArray(3, 3);

        int[][] arr2 = obj.getArray(3,3);

        obj.display(arr1); 
        obj.display(arr2); 

        int[][] ans = obj.getMans(arr1, arr2);
        obj.display(ans);
    }
}


