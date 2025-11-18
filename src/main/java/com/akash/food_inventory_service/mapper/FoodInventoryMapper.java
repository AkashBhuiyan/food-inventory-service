package com.akash.food_inventory_service.mapper;

import com.akash.food_inventory_service.dto.FoodInventoryDTO;
import com.akash.food_inventory_service.entity.FoodInventory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author: akash
 * Date: 18/11/25
 */
@Mapper
public interface FoodInventoryMapper {
    FoodInventoryMapper INSTANCE = Mappers.getMapper(FoodInventoryMapper.class);

    FoodInventory mapFoodInventoryDTOToFoodInventory(FoodInventoryDTO foodInventoryDTO);

    FoodInventoryDTO mapFoodInventoryToFoodInventoryDto(FoodInventory foodInventory);
}
