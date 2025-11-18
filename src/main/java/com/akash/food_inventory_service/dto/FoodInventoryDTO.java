package com.akash.food_inventory_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 18/11/25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodInventoryDTO {

    private int id;
    private String itemName;
    private String itemDescription;
    private Boolean isVeg;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;
}
