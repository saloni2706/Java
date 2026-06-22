
public class LoopContinued {
    public static void main(String[] args) {
        //For loops

        for (int i = 0; i < 100; i++) {
            System.out.println("sorry "+ i);

            if(i==2){
                break;
            }
            
        }
        System.out.println("broken out from the for-loop");
        //i is the iterating variable
        //i++ basically means i=i+1


        //if we want to print all the characters of this string



        String str="ab";

        int n=str.length();

        //counting in programming starts from 0

        //indices starts from 0 and endtill str.length()-1;

        for(int i=n-1;i>=0;i--) {
            char ch= str.charAt(i);
            System.out.println("character at the " +i+ " position is "+ ch);
        }

        //i-- refers to i=i-1

        //print out numbers which are divisible by 3 from 3 to 50

        for (int i=3;i<=50;i=i+3){
            System.out.println(i);
        }







    }
    
}
