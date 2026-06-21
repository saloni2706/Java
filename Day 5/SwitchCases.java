public class SwitchCases {
    public static void main(String[] args) {
        
        //switch cases are just like if else, just a simpler way of writing if-else
            

            int num=5;
            if(num==1){
                System.out.println("one");
            }
            else if(num==2){
                System.out.println("two");
            }
            else if(num==3){
                System.out.println("three");
            }
        
            


            switch(num) {
                case 1: System.out.println("one");
                    break;
                case 2: System.out.println("two");
                    break;
                case 3: System.out.println("three");
                    break;
                    default:
                        System.out.println("unknown");

            }
            

    }
    
}
