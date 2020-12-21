package org.example.exoalimentation.application.aliment;

import org.example.exoalimentation.domain.entity.Aliment;
import org.example.exoalimentation.infrastructure.aliment.AlimentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AlimentServiceImpl implements AlimentService {

    @Autowired
    AlimentDao dao;

    @Transactional
    public void createFoodService(Aliment a) {
        dao.createFood(a);
    }

    public Aliment showFoodDetailsSvce(Integer code) {
        return dao.showFoodDetailsDao(code);
    }
}
