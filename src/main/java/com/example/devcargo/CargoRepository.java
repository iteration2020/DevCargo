package com.example.devcargo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.name,'',p.content,'',p.departureCity,'',p.departureDate,'',p.arrivalCity,'',p.arrivalDate) LIKE %?1%")
    List<Cargo> search(String keyword);

    List<Cargo> findByDepartureCity(String departureCity);

    List<Cargo> findByArrivalCity(String arrivalCity);

    List<Cargo> findByDepartureDateAfter(Date departureDate);

    List<Cargo> findByArrivalDateAfter(Date arrivalDate);

    // Другие методы по необходимости
}
