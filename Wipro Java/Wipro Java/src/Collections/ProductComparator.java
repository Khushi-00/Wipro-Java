package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductComparator implements Comparator<Product>{

	public int compare(Product p1, Product p2) {
        int priceCompare = Double.compare(p1.price, p2.price);
        if (priceCompare != 0) {
            return priceCompare; 
        }
        return p1.name.compareTo(p2.name);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(201, "Pastel Colours", 999));
        products.add(new Product(202, "Paint Brushes", 799));
        products.add(new Product(203, "Easel Stand", 5999));
        products.add(new Product(204, "Canvases", 799));         
        products.add(new Product(205, "Palettes", 799));      
        products.add(new Product(206, "Apron", 1999));

        Collections.sort(products, new ProductComparator());

        System.out.println("");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}