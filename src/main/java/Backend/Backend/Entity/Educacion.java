package Backend.Backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Integer idEdu;
    private Integer inicioEdu;
    private Integer finEdu;
    private String institucionEdu;
    private String tituloEdu;

    public Educacion() {

    }

    public Educacion(Integer idEdu, Integer inicioEdu, Integer finEdu, String institucionEdu, String tituloEdu) {
        this.idEdu = idEdu;
        this.inicioEdu = inicioEdu;
        this.finEdu = finEdu;
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
    }

    public Integer getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Integer idEdu) {
        this.idEdu = idEdu;
    }

    public Integer getInicioEdu() {
        return inicioEdu;
    }

    public void setInicioEdu(Integer inicioEdu) {
        this.inicioEdu = inicioEdu;
    }

    public Integer getFinEdu() {
        return finEdu;
    }

    public void setFinEdu(Integer finEdu) {
        this.finEdu = finEdu;
    }

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }
}
