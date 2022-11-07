package co.com.censopoblacion.service;

import co.com.censopoblacion.model.Municipio;

import java.util.List;
import java.util.Optional;

public interface MunicipioService {
    List<Municipio> Listar();
    Optional<Municipio> listarId(Long id_municipio);
}
