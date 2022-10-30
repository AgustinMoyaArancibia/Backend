package com.portfolio.moya.Repository;

import com.portfolio.moya.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys extends JpaRepository<hys, Integer> {

    public Optional<hys> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
