package co.com.censo.poblacion.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "informacionpoblacion")
@NoArgsConstructor
public class InformacionPoblacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_registro;

    @Column(name = "codigo_municipio", nullable = false, unique = true)
    private Long codigo_municipio;

    @Column(name = "poblacion_urbana")
    private Long poblacion_urbana;

    @Column(name = "poblacion_rural")
    private Long poblacion_rural;


    public InformacionPoblacion(Long id_registro, Long codigo_municipio, Long poblacion_urbana, Long poblacion_rural, Long poblacion_total, double porcentaje_urbana, double porcentaje_rural) {
        this.id_registro = id_registro;
        this.codigo_municipio = codigo_municipio;
        this.poblacion_urbana = poblacion_urbana;
        this.poblacion_rural = poblacion_rural;
    }




    public Long getId_registro() {
        return id_registro;
    }

    public void setId_registro(Long id_registro) {
        this.id_registro = id_registro;
    }

    public Long getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Long codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public Long getPoblacion_urbana() {
        return poblacion_urbana;
    }

    public void setPoblacion_urbana(Long poblacion_urbana) {
        this.poblacion_urbana = poblacion_urbana;
    }

    public Long getPoblacion_rural() {
        return poblacion_rural;
    }

    public void setPoblacion_rural(Long poblacion_rural) {
        this.poblacion_rural = poblacion_rural;
    }

}
