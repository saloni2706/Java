
public class JavaStack {
    public static void main(String[] args) {
        double pi = 3.14;  //local variable
        fxn1();
        fxn2();
        
    }

    public static void fxn1() {
        int num= 100;
        fxn2();
        System.out.println(num);

    }
    public static void fxn2(){
        int x1= 20;
        int x2=40;
        System.out.println(x1*x2);
    }
    
}
