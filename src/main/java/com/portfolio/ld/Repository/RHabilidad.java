package com.portfolio.ld.Repository;

import com.portfolio.ld.Entity.Habilidad;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RHabilidad extends JpaRepository<Habilidad, Integer>{
    public Optional<Habilidad> findByNombreH(String nombreH);
    public boolean existsByNombreH(String nombreH);
}
