class Bt1
{
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int[] merge(int a[], int[] b)
    {
        int c[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length)
        {
            c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];

        return c;
    }

    int[] mergeSort(int[] a, int i, int j)
    {
        if(i == j) return new int[] {a[i]};

        int m = (i + j) / 2;
        int[] left = mergeSort(a, i, m);
        int[] right = mergeSort(a, m + 1, j);
        return merge(left, right);
    }

    void display(int[] arr)
    {
        System.out.print("Displaying array--->\n");
        for(int itm : arr)
        {
            System.out.println(itm);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {9, 1, -4, 3, 0, -100};
        Bt1 obj = new Bt1();
        obj.display(a);

        obj.display(obj.mergeSort(a, 0, a.length - 1));
    }
}



