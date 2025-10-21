package co.edu.uptc.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDTO {
    private Long id;
    private String name;
    private String itemDescription;
    private boolean isVeg;
    private Number price;
    private Long restaurantId;
    private Number quantity;
}
