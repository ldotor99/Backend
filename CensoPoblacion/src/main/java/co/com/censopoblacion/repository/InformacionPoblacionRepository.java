package co.com.censopoblacion.repository;

import co.com.censopoblacion.model.InformacionPoblacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacionPoblacionRepository extends JpaRepository<InformacionPoblacion, Long> {
}
