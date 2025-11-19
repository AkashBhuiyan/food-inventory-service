package com.akash.food_inventory_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 18/11/25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
    private Long Long;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
