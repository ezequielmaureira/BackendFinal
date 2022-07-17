package Backend.Backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Integer idExp;
    private Integer inicioExp;
    private Integer finExp;
    private String empresaExp;
    private String puestoExp;
    private String actividadExp;
    private String fotoExp;

    public Experiencia() {

    }

    public Experiencia(Integer idExp, Integer inicioExp, Integer finExp, String empresaExp, String puestoExp, String actividadExp,String fotoExp) {
        this.idExp = idExp;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.empresaExp = empresaExp;
        this.puestoExp = puestoExp;
        this.actividadExp = actividadExp;
        this.fotoExp=fotoExp;
    }

    public Integer getIdExp() {
        return idExp;
    }

    public void setIdExp(Integer idExp) {
        this.idExp = idExp;
    }

    public Integer getInicioExp() {
        return inicioExp;
    }

    public void setInicioExp(Integer inicioExp) {
        this.inicioExp = inicioExp;
    }

    public Integer getFinExp() {
        return finExp;
    }

    public void setFinExp(Integer finExp) {
        this.finExp = finExp;
    }

    public String getEmpresaExp() {
        return empresaExp;
    }

    public void setEmpresaExp(String empresaExp) {
        this.empresaExp = empresaExp;
    }

    public String getPuestoExp() {
        return puestoExp;
    }

    public void setPuestoExp(String puestoExp) {
        this.puestoExp = puestoExp;
    }

    public String getActividadExp() {
        return actividadExp;
    }

    public void setActividadExp(String actividadExp) {
        this.actividadExp = actividadExp;
    }

    public String getFotoExp() { return fotoExp;  }

    public void setFotoExp(String fotoExp) { this.fotoExp = fotoExp;
    }
}