import java.util.*;

public class Mt3{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int original  = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit == 0 || digit == 1 || digit == 6 || digit == 8 || digit == 9){
                if(digit == 6){
                    digit = 9;
                }

                else if(digit == 9){
                    digit = 6;
                }
                rev = rev * 10 + digit;
            }

            else{
                num = num / 10;
            }
        }
        if(rev == original)
        {
            System.out.println("Number is strobogrammatic");
        }
        else
        {
            System.out.println("Number is not strobogrammatic");
        }
        input.close();
    }
}