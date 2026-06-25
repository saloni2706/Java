public class ReturnTypesAndArguments {
    public static void main(String[] args) {

        int ans= Multipy100(4);
        System.out.println(ans);

        multiply(100,1);

        PrintSomething(24);
        PrintSomething("banti");

        System.out.println("hello");


    }
    public static void PrintSomething(String name) {
        System.out.println("My name is " + name);

        
    }

    public static void PrintSomething(int age) {

        System.out.println("My age is " + age);
        
    }

    public static void multiply(int num1, int num2) {

        System.out.println(num1*num2);
    }

    public static int Multipy100(int num){

        int result = num*100;
        return result;

    }
    
}
