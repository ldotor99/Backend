package co.com.censopoblacion.service;

import co.com.censopoblacion.dto.InformacionPoblacionDto;
import co.com.censopoblacion.model.InformacionPoblacion;

import java.util.List;

public interface InformacionPoblacionService {
    List<InformacionPoblacionDto> Listar();
    List<InformacionPoblacionDto> listarId(Long id_registro);
    InformacionPoblacion agregar(InformacionPoblacion I);
    InformacionPoblacion editar(InformacionPoblacion I);
    String Eliminar(Long id_registro);
}
