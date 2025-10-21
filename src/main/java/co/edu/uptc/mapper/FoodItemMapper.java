package co.edu.uptc.mapper;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {
    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFromFoodItemDTO(FoodItemDTO foodItemDTO);
    FoodItemDTO mapFromFoodItemDTO(FoodItem foodItem);
}
