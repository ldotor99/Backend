package co.com.censopoblacion.service;

import co.com.censopoblacion.dto.InformacionPoblacionDto;
import co.com.censopoblacion.model.InformacionPoblacion;
import co.com.censopoblacion.repository.InformacionPoblacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InformacionPoblacionServiceImplementacion implements InformacionPoblacionService{

    @Autowired
    private final InformacionPoblacionRepository informacionPoblacionRepository;

    @Override
    public List<InformacionPoblacionDto> Listar(){
        return informacionPoblacionRepository.findAll()
                .stream()
                .map(this::convertir).collect(Collectors.toList());
    }

    private InformacionPoblacionDto convertir(InformacionPoblacion I){
        InformacionPoblacionDto iDto = new InformacionPoblacionDto();
        iDto.setId_registro(I.getId_registro());
        iDto.setPoblacion_rural(I.getPoblacion_rural());
        iDto.setPoblacion_urbana(I.getPoblacion_urbana());
        iDto.setCodigo_municipio(I.getCodigo_municipio());
        long poblacion_total=I.getPoblacion_rural() + I.getPoblacion_urbana();
        iDto.setTotal_poblacion(poblacion_total);
        int porcentajeR=(int) Math.ceil((I.getPoblacion_rural()*100)/poblacion_total);
        iDto.setPorcentaje_rural(porcentajeR);
        int porcentajeU=(int) Math.ceil((I.getPoblacion_urbana()*100)/(poblacion_total));
        iDto.setPorcentaje_urbana(porcentajeU);
        String categoria ="";
        if(porcentajeU >= 60){
            categoria="Urbana";
        }
        if(porcentajeU >= 40 && porcentajeU< 60){
            categoria="Semi urbana";
        }
        if(porcentajeU < 40){
            categoria="Rural";
        }
        iDto.setCategoria_municipio(categoria);

        return iDto;
    }

    @Override
    public List<InformacionPoblacionDto> listarId(Long id_registro) {
        return informacionPoblacionRepository.findById(id_registro).stream()
                .map(this::convertir).collect(Collectors.toList());
    }
    @Override
    public InformacionPoblacion  agregar(InformacionPoblacion I) {
       return informacionPoblacionRepository.save(I);
    }


    @Override
    public InformacionPoblacion editar(InformacionPoblacion I) {
        return null;
    }

    @Override
    public String Eliminar(Long id_registro) {
        informacionPoblacionRepository.deleteById(id_registro);
        return "Eliminado";}
}
