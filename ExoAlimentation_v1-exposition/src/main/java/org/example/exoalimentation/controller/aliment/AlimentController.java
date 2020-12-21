package org.example.exoalimentation.controller.aliment;

import io.swagger.annotations.ApiOperation;
import org.example.exoalimentation.application.aliment.AlimentService;
import org.example.exoalimentation.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AlimentController {

    @Autowired
    AlimentService alimentService;

    @ApiOperation(value = "Permet de créer les aliments en dur", notes = "à compléter")
    @GetMapping("/create")
    void create(){

        Groupe g1 = new Groupe();
        g1.setNomgroupe("entrées et plats composés");
        Groupe g2 = new Groupe();
        g2.setNomgroupe("fruits, légumes, légumineuses et oléagineux");


        SousGroupe sg1 = new SousGroupe();
        sg1.setNomSousGroupe("salades composées et crudités");
        SousGroupe sg2 = new SousGroupe();
        sg2.setNomSousGroupe("légumes");

        SousSousGroupe ssg2 = new SousSousGroupe();
        ssg2.setNomSousSousGroupe("légumes et leurs produits de la Martinique");

        Composition c1 = new Composition();
        c1.setEau(76.5);
        c1.setProteine(9.15);
        c1.setGlucide(7.74);
        c1.setLipide(4.7);
        c1.setSucre(3.08);

        Composition c2 = new Composition();
        c2.setEau(64.1);
        c2.setProteine(1.06);
        c2.setGlucide(0.0);
        c2.setLipide(0.057);
        c2.setSucre(0.0);

        Aliment a1 = new Aliment();
        a1.setId(25601);
        a1.setNomAliment("Salade de thon et légumes, appertisée");
        a1.setGroupe(g1);
        a1.setSousgroupe(sg1);
        a1.setComposition(c1);

        Aliment a2 = new Aliment();
        a2.setId(20800);
        a2.setNomAliment("Banane jaune, pulpe, cuite à la vapeur, prélevée à la Martinique");
        a2.setGroupe(g2);
        a2.setSousgroupe(sg2);
        a2.setSoussousgroupe(ssg2);
        a2.setComposition(c2);

        alimentService.createFoodService(a1);
        alimentService.createFoodService(a2);
    }

    @GetMapping("/show/{id}")
    Aliment displayCompo(@PathVariable("id") Integer code){
        return alimentService.showFoodDetailsSvce(code);
    }

}
