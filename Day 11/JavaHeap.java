class Processor {
    String processorName;

    Processor() {
        processorName = "Snapdragon";
    }
}

class Smartphone {
    String modelName;
    String brandName;
    int price;
    double screenSize;
    String color;

    Processor proc;

    Smartphone(String modelName, String brandName, int price, double screenSize, String color) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
    }
}

public class JavaHeap {

    public static void main(String[] args) {

        double pi = 3.14;

        Smartphone sm1;

        sm1 = new Smartphone("Note 10", "Samsung", 50000, 6.0, "Red");

        // sm1 is a reference variable pointing to the object created in heap memory

        sm1 = new Smartphone("A52", "Samsung", 20000, 6.0, "Black");

        // Actual object is created in the heap memory
        // Reference variables (pointers) are stored in the stack memory

        int x = 10; // Primitive data types store actual values

        Processor proc1 = new Processor();

        sm1.proc = proc1;

        System.out.println("Model : " + sm1.modelName);
        System.out.println("Brand : " + sm1.brandName);
        System.out.println("Price : " + sm1.price);
        System.out.println("Screen Size : " + sm1.screenSize);
        System.out.println("Color : " + sm1.color);
        System.out.println("Processor : " + sm1.proc.processorName);
    }
}