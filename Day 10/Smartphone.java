public class Smartphone {
    
          
//iNSTANCE VARIABLES
    String model_name;
    String brand_name;
    int price;
    int screensize_inches;
    String colour;

    public Smartphone(String model_name, String Brand_name, int price, int screensize, String colour){
       this.model_name= model_name;
       this.brand_name= brand_name;
       this.price= price;
       this.screensize_inches= screensize_inches;
       this.colour= colour;



        //Constructor in java is a special method that is used to initialize objects. The constructor is called when an object of a class is created
        //it can be used to set initial values for object attributes.
        //it has the same name as the class and does not have a return type
    }
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