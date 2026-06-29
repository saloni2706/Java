public class Smartphone {
    
          
//iNSTANCE VARIABLES
    String model_name;
    String brand_name;
    int price;
    int screensize_inches;
    String colour;
public static void main(String[] args) {
    }
    
    //methods to display details of the smartphone
    public void Details(){

        System.out.println("The model name is " + model_name );
        System.out.println("The brand name is " + brand_name );

    }
    
    public void TurnOn(){
        System.out.println("Smartphone is turning on");

    }
    public void TurnOff(){

        System.out.println("Smartphone is turning off");
    }
    public void call() {
        System.out.println("Smartphone is making a call");
    }
}