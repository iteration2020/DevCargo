package com.example.devcargo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.name,'',p.content,'',p.departureCity,'',p.departureDate,'',p.arrivalCity,'',p.arrivalDate) LIKE %?1%")
    List<Cargo> search(String keyword);
}
