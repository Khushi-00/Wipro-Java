package corejava.Labsessions.Today31;

public class Product {
	
	int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + ". " + name + " - Rs." + price;
    }

}
