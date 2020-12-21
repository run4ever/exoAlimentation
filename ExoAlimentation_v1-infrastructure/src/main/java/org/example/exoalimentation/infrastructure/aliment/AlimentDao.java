package org.example.exoalimentation.infrastructure.aliment;

import org.example.exoalimentation.domain.entity.Aliment;
import org.example.exoalimentation.domain.entity.Composition;

public interface AlimentDao {

    void createFood(Aliment a);
    Aliment showFoodDetailsDao(Integer code);

}
