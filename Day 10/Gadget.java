
public class Gadget {
    public static void main(String[] args) {
    
        
        Smartphone phone1;
        
        phone1= new Smartphone("Note10","Samsung", 50000,6, "Black");
        
        phone1.Details();

        Smartphone phone2= new Smartphone("Iphone11","Apple",70000,6,"Red");

        phone2.model_name="Iphone11";
        phone2.brand_name="Apple";
        phone2.price= 70000;
        phone2.colour="Red";
        phone2.screensize_inches=6;

        phone2.TurnOff();
        phone2.Details();



        

        


        








    }
    
}
