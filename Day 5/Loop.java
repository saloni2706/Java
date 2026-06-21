public class Loop {
    public static void main(String[] args) {
    
        boolean bool=true;

        int count=0;
        while(count<50){
            System.out.println("Banti");
            count=count+1; //to stop printing at the count of 50 otherwise it will print banti infinite times

            //to stop print at the count of 5 we will use break

            if(count==5){
                break;
            }
        }
        System.out.println("while-loop has been terminated");

        }

    }
    

