package com.revature.digimon;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigimonRepository extends CrudRepository<Digimon, Integer>{
    Digimon findById(int id);
    List<Digimon> findAll();
    void deletedById(int id);
}
