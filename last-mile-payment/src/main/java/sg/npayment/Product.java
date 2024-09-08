package sg.npayment;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private List<String> tags;
    private List<Review> reviews;
}