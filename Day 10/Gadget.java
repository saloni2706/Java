class Smartphone {

    String modelName;
    String brandName;
    int price;
    int screenSize;
    String color;

    Smartphone(String modelName, String brandName, int price, int screenSize, String color) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
    }

    void Details() {
        System.out.println("Model Name : " + modelName);
        System.out.println("Brand Name : " + brandName);
        System.out.println("Price      : " + price);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Color      : " + color);
    }

    void TurnOff() {
        System.out.println(modelName + " is turning off...");
    }
}
