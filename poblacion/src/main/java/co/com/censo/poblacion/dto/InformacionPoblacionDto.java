package co.com.censo.poblacion.dto;

import lombok.Data;

@Data
public class InformacionPoblacionDto{
    private Long id_registro;
    private Long codigo_municipio;
    private Long poblacion_urbana;
    private Long poblacion_rural;
    private Long total_poblacion;
    private int porcentaje_urbana;
    private int porcentaje_rural;
    private String categoria_municipio;

    public int getPorcentaje_urbana() {
        return porcentaje_urbana;
    }

    public void setPorcentaje_urbana(int porcentaje_urbana) {
        this.porcentaje_urbana = porcentaje_urbana;
    }

    public int getPorcentaje_rural() {
        return porcentaje_rural;
    }

    public void setPorcentaje_rural(int porcentaje_rural) {
        this.porcentaje_rural = porcentaje_rural;
    }

    public String getCategoria_municipio() {
        return categoria_municipio;
    }

    public void setCategoria_municipio(String categoria_municipio) {
        this.categoria_municipio = categoria_municipio;
    }

    public InformacionPoblacionDto() {
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

    public Long getPoblacion_urbana(double v) {
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

    public Long getTotal_poblacion() {
        return total_poblacion;
    }

    public void setTotal_poblacion(Long total_poblacion) {
        this.total_poblacion = total_poblacion;
    }

    public Long getPoblacion_urbana() {
        return poblacion_urbana;
    }

}
