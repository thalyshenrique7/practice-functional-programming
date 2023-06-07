package product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  In a list of products with name and price, calculate the average price of products and with more than price
 *
 */
public class ProductExercise {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList( new Product("Iphone", 999),
                                                new Product("Macbook", 1999),
                                                new Product("Airpods", 599));

        double averageProduct = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);

        Product greaterPrice = products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Average price of products: " + averageProduct);
        System.out.println("Greater price: " + greaterPrice);
    }
}
