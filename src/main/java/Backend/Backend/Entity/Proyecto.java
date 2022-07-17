package Backend.Backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyecto implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(nullable = false)
        private Integer idProyecto;
        private String nombreProyecto;
        private Integer anoProyecto;
        private String mesProyecto;
        private String descripcionProyecto;
        private String linkProyecto;

    public Proyecto() {

    }

    public Proyecto (Integer idProyecto, String nombreProyecto, Integer anoProyecto, String mesProyecto, String descripcionProyecto, String linkProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.anoProyecto = anoProyecto;
        this.mesProyecto = mesProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.linkProyecto = linkProyecto;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Integer getAnoProyecto() {
        return anoProyecto;
    }

    public void setAnoProyecto(Integer anoProyecto) {
        this.anoProyecto = anoProyecto;
    }

    public String getMesProyecto() {
        return mesProyecto;
    }

    public void setMesProyecto(String mesProyecto) {
        this.mesProyecto = mesProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getLinkProyecto() {
        return linkProyecto;
    }

    public void setLinkProyecto(String linkProyecto) {
        this.linkProyecto = linkProyecto;
    }
}




