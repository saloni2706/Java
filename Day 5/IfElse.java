public class IfElse {
    public static void main(String[] args) {
        
        boolean tired= false;

        if(tired){
            System.out.println("i am feeling sleepy");
        
        }
        else{
            System.out.println("i am feeling energetic!");


        }
        if(!tired){ // ! represents the not operator
            System.out.println("i am feeling sleepy");


        }
        else{
            System.out.println("i am feeling energetic!");
        }

        int marks=60;

        if(marks>=95){
            System.out.println("A+");

        }
        else if(marks>=80){
            System.out.println("A");
        }
        else if(marks>=70){
            System.out.println("B+");

        }
        else {
            System.out.println("B");
        }




        int money= 60;
        String car="None";
        if(money>=80){
            car="Audi";

        }
        else if(money>=60){
            car="Mercedes";
        
        }
        else if(money>=40){
            car="Hyundai";
        }
        System.out.println(car);
            
        

    
    }
    
}
