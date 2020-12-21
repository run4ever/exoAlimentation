package org.example.exoalimentation.application.aliment;

import org.example.exoalimentation.domain.entity.Aliment;
import org.example.exoalimentation.domain.entity.Composition;

public interface AlimentService {

    void createFoodService(Aliment a);
    Aliment showFoodDetailsSvce(Integer code);

}
