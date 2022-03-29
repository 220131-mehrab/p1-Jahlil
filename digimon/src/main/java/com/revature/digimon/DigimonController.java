package com.revature.digimon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigimonController {
    @Autowired
    private DigimonRepository digimon;

    @GetMapping("/digimon/{id}")
    public Digimon getDigimonById (@PathVariable(value = "id")int id){
        return digimon.findById(id);
    }
}
