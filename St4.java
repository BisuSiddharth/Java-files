import java.util.*;

public class St4{

    boolean isPrime(int n){

        if(n <= 1) return false;

        int i = 2;
        while(i <= Math.sqrt(n)){
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {-3, 4, 6, 1, -9, 6, 8}; 

        int min = 0, max = 0;

        for(int i : arr){
            if(i > max) max = i;

            if(i < min) min = i;
        }

        System.out.printf("Max = %d, Min = %d\n", max, min);

        St4 obj = new St4();
        int random = 13331 + 1;

        System.out.println(obj.isPrime(random));
    }
}
