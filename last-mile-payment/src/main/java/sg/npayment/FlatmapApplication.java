package sg.npayment;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapApplication

{
    public static void main(String[] args) {
        // Sample data for products
        List<Product> products = new ArrayList<>();

        List<String> tags1 = new ArrayList<>();
        tags1.add("electronics");
        tags1.add("smartphone");
        tags1.add("android");
        List<Review> reviews1 = new ArrayList<>();
        reviews1.add(new Review("Himanshu", "Great phone!", 5));
        reviews1.add(new Review("Virat", "Battery life could be better.", 4));

        Product product1 = new Product("Smartphone A", tags1, reviews1);
        products.add(product1);


        List<String> tags2 = new ArrayList<>();
        tags2.add("clothing");
        tags2.add("t-shirt");
        tags2.add("casual");
        List<Review> reviews2 = new ArrayList<>();
        reviews2.add(new Review("Ronaldo", "Very comfortable material.", 5));
        reviews2.add(new Review("John", "Size is big.", 3));

        Product product2 = new Product("Casual T-Shirt", tags2, reviews2);
        products.add(product2);


        // Sample data for tags
        List<String> allTags = products.stream()
                .flatMap(product -> product.getTags().stream())
                .collect(Collectors.toList());
        System.out.println("All Tags: " + allTags);


        // Sample data for reviews
        List<Review> allReviews = products.stream()
                .flatMap(product -> product.getReviews().stream())
                .collect(Collectors.toList());
        System.out.println("All Reviews: " + allReviews);

    }
}
