import java.util.*;

public class Bt2{

    void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // void bubbleSort(int[] a)
    // {
    //     for(int i = 0; i < a.length; i++)
    //     {
    //         for(int j = 0; j < a.length - 1 - i; j++)
    //         {
    //             if(a[j] > a[j + 1])
    //             {
    //                 swap(a, j, j + 1);
    //             }
    //         }
    //     }
    // }

    // void selectionSort(int[] a)
    // {
    //     for(int i = 0; i < a.length; i++)
    //     {
    //         int min = i;
    //         for(int j = i; j < a.length; j++)
    //         {
    //             if(a[j] < a[min]){
    //                 min = j;
    //             }
    //         }
    //         swap(a, i, min);
    //     }
    // }

    void display(int a[])
    {
        System.out.println("Displaying Array---->");
        for(int i : a){
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = {100, 1, -5, 9 ,4, 0};
        Bt2 ob = new Bt2();

        ob.display(arr);
        // ob.selectionSort(arr);
        ob.display(arr);
        input.close();
    }
}


