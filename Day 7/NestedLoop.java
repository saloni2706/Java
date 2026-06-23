public class NestedLoop {
    public static void main(String[] args) {

        //Nested loops

        int count=3;

        if(count>2){
            if(count<4){
                System.out.println("count is 3");

            }
        }

        for (int i=0;i<10;i++){
            for (int j=0;j<5;j++){
                System.out.println("i= "+i+" j= "+j);
                count++;
            }

                   
        }
        System.out.println(count);

        //50*10000=500000
        //10*5 = 50
        

      
    }
    
}
