package com.revature.digimon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DigimonRepository extends JpaRepository<Digimon, Long> {
    
}
