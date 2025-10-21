package co.edu.uptc.service;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.entity.FoodItem;
import co.edu.uptc.mapper.FoodItemMapper;
import co.edu.uptc.repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodItemService {
    FoodItemRepo foodItemRepo;

    public FoodItemDTO saveFoodItemDTO(FoodItemDTO foodItemDTO) {
        FoodItem foodItem = foodItemRepo.save(FoodItemMapper.INSTANCE.mapFromFoodItemDTO(foodItemDTO));
        return FoodItemMapper.INSTANCE.mapFromFoodItemDTO(foodItem);
    }

    public List<FoodItemDTO> listAllFoodItems() {
        List<FoodItem> listFoodItems = foodItemRepo.findAll();
        return listFoodItems.stream().map(FoodItemMapper.INSTANCE::mapFromFoodItemDTO).collect(Collectors.toList());
    }
}
