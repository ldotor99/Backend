package co.com.censopoblacion.controller;

import co.com.censopoblacion.model.Municipio;
import co.com.censopoblacion.service.MunicipioServiceImplementacion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class MunicipioController {
    @Autowired
    private final MunicipioServiceImplementacion municipioServiceImplementacion;

    @GetMapping("/listarMunicipio")
    public ResponseEntity<List<Municipio>> listarDepartamento(){
        return new ResponseEntity<List<Municipio>>(municipioServiceImplementacion.Listar(), HttpStatus.ACCEPTED);
    }


    @GetMapping("/listarMuncipio/{id_municipio}")
    public ResponseEntity<Optional<Municipio>> listarMuncipioId(@PathVariable("id_municipio") Long id_municipio){
        return new ResponseEntity<Optional<Municipio>>(municipioServiceImplementacion.listarId(id_municipio), HttpStatus.ACCEPTED);
    }
}
