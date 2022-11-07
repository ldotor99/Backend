package co.com.censopoblacion.service;

import co.com.censopoblacion.model.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoService {
    List<Departamento> Listar();
    Optional<Departamento> listarId(Long id_departamento);
}
