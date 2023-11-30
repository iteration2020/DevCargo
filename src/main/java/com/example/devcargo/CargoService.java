package com.example.devcargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> search(String keyword) {
        return cargoRepository.search(keyword);
    }

    public List<Cargo> listAll() {
        return cargoRepository.findAll();
    }

    public Cargo get(Long id) {
        return cargoRepository.findById(id).orElse(null);
    }

    public void save(Cargo cargo) {
        cargoRepository.save(cargo);
    }

    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }
}
