package com.portfolio.moya.Service;

import com.portfolio.moya.Entity.Persona;
import com.portfolio.moya.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    public List<Persona> list() {
        return ipersonaRepository.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return ipersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombreE(String nombreE) {
        return ipersonaRepository.findByNombre(nombreE);
    }

    public void save(Persona persona) {
        ipersonaRepository.save(persona);
    }

    public void delete(int id) {
        ipersonaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return ipersonaRepository.existsById(id);
    }

    public boolean existsByNombreE(String nombre) {
        return ipersonaRepository.exitsByNombre(nombre);
    }

}
