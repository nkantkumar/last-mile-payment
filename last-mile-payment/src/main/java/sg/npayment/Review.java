package sg.npayment;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Review {
    private String author;
    private String comment;
    private int rating;
}