package co.com.censopoblacion.controller;

import co.com.censopoblacion.model.Departamento;
import co.com.censopoblacion.service.DepartamentoServiceImplementacion;
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
public class DepartamentoController {
    @Autowired
    private final DepartamentoServiceImplementacion departamentoServiceImplementacion;

    @GetMapping("/listarDepartamento")
    public ResponseEntity<List<Departamento>> listarDepartamento(){
        return new ResponseEntity<List<Departamento>>(departamentoServiceImplementacion.Listar(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/listarDepartamento/{id_departamento}")
    public ResponseEntity<Optional<Departamento>> listarDepartamentoId(@PathVariable("id_departamento") Long id_departamento){
        return new ResponseEntity<Optional<Departamento>>(departamentoServiceImplementacion.listarId(id_departamento), HttpStatus.ACCEPTED);
    }


}
