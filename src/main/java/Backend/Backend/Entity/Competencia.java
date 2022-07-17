package Backend.Backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Competencia implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column (nullable = false)
    private Integer idCompetencia;
    private String nombre;
    private Integer grado;
    private String foto;

    public Competencia() {

    }

    public Competencia(Integer id, String nombre, Integer grado, String foto) {
        this.idCompetencia = id;
        this.nombre = nombre;
        this.grado = grado;
        this.foto=foto;

    }


    public Integer getId() {
        return idCompetencia;
    }

    public void setId(Integer id) {
        this.idCompetencia = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}

