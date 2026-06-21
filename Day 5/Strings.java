public class Strings {
    public static void main(String[] args) {
        
   
         //string is not a primitive data type.

     String str ="Bantii";

     //a string will have characters from 0 to str.length()-1

     char ch=str.charAt(0);

     System.out.println(ch);

     //numbering starts from 0 in programming

     String f = str.substring(0);
     //return us a part of the string str which starts at the first index and ends
     //at the second index

     System.out.println(f);


     String str2 = "hello everyone, welcome to tutedude everyone";

     //we want to find the position of everyone

     int ind= str2.lastIndexOf("everyone");

     System.out.println(ind);

     String a="hello";
     
    String b="hello";
     
     if(a.equals("hello")){ 
        System.out.println("found");
     }

     


    


    }
    
}
