class Student{
    public static void main(String[] args){
        int a = 10;
        String b = "ABC";
        System.out.println("Hello World");

        String message = String.format("Value of %s = %d.", b, a);
        System.out.println("Value of " + b + " = " + a + ".");
        System.out.println(message);
        System.out.printf("Value of %s = %d.\n", b, a);
    }
}
