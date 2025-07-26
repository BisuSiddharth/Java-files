import java.util.Scanner; // Scanner is actually a class


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        age = 0;
        age = age + 7;
        System.out.println(age);
        
        Function op = new Function();
        op.printHello();

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        System.out.println("Sum = " + op.sum(a, b));
        input.close();
    }
}

class Function{
    void printHello()
    {
        System.out.println("Hello");
    }

    int sum(int a, int b){
        return a + b;
    }
}  

