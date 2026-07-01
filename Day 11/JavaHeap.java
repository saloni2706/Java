public class JavaHeap {
    public static void main(String[] args) {
        double pi=3.14;

        Smartphone sm1;
        sm1 = new Smartphone("Note 10","Samsung",50000,6,"Red");

        //sm1 is not the actual object , it is a reference variable which is pointing to the object created in the heap memory.

        sm1 = new Smartphone("A52","samsung",20000,6,"black");
        //actual object ia created and stored in the heap memory
        //pointers are stored in the stack memory.

        int x= 10; //x has the actual value because int, double, boolean etc sre primitive data types

        Processor proc1= new Processor(); //proc1 was a reference variable which points to a processor

        sm1.proc= proc1;

    }
    
}

