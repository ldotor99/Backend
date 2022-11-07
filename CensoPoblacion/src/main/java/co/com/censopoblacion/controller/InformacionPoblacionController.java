package co.com.censopoblacion.controller;

import co.com.censopoblacion.dto.InformacionPoblacionDto;
import co.com.censopoblacion.model.InformacionPoblacion;
import co.com.censopoblacion.service.InformacionPoblacionServiceImplementacion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class InformacionPoblacionController {
    @Autowired
    private final InformacionPoblacionServiceImplementacion informacionPoblacionServiceImplementacion;

    @GetMapping("/listarInformacionPoblacion")
    public List<InformacionPoblacionDto> listarInformacion(){
        return informacionPoblacionServiceImplementacion.Listar();
    }

    @GetMapping("/listarInformacionPoblacion/{id_registro}")
    public List<InformacionPoblacionDto> listarInformacionPoblacionId(@PathVariable("id_registro") Long id_registro){
        return informacionPoblacionServiceImplementacion.listarId(id_registro);
    }

    @PostMapping("/crearInformacionPoblacion")
    public InformacionPoblacion crearInformacionPoblacion(@RequestBody InformacionPoblacion I) {
        return informacionPoblacionServiceImplementacion.agregar(I);
    }

    @GetMapping("/EliminarInformacionPoblacion/{id_registro}")
    public ResponseEntity<String> eliminarInformacionPoblacion(@PathVariable("id_registro") Long id_registro){
        return new ResponseEntity<String>(informacionPoblacionServiceImplementacion.Eliminar(id_registro), HttpStatus.ACCEPTED);
    }
}
