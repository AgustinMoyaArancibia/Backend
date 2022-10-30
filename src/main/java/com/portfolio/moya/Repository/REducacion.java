
package com.portfolio.moya.Repository;

import com.portfolio.moya.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion,Integer>{
    
    
    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean exitsByNombreE(String nombreE);
    
    
    
    
}
