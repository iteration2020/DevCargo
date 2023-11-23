
package com.example.devcargo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {
    @Autowired
    private CargoRepository repo;

    public CargoService() {
    }

    public List<Cargo> listAll(String keyword) {
        return keyword != null ? this.repo.search(keyword) : this.repo.findAll();
    }

    public void save(Cargo cargo) {
        this.repo.save(cargo);
    }

    public Cargo get(Long id) {
        return (Cargo)this.repo.findById(id).get();
    }

    public void delete(Long id) {
        this.repo.deleteById(id);
    }
}
