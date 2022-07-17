package Backend.Backend.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

public class UsuarioDatos implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column (nullable = false)
 private Integer id;
 private String nombre;
 private String apellido;
 private String titulo;
 private String descripcion;
 private String fotoPerfil;
 private String fotoBanner1;
 private String fotoBanner2;
 private String fotoBanner3;



 @OneToMany(fetch = FetchType.LAZY,mappedBy="idCompetencia")
 private List<Competencia> competenciaList;

 @OneToMany(fetch = FetchType.LAZY,mappedBy="idExp")
 private List<Experiencia> experienciaList;


 @OneToMany(fetch = FetchType.LAZY,mappedBy="idEdu")
 private List<Educacion> educacionList;

 @OneToMany(fetch = FetchType.LAZY,mappedBy="idProyecto")
 private List<Proyecto> proyectoList;

 public UsuarioDatos(){

}

 public UsuarioDatos(Integer id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil, String fotoBanner1, String fotoBanner2, String fotoBanner3) {
  this.id = id;
  this.nombre = nombre;
  this.apellido = apellido;
  this.titulo = titulo;
  this.descripcion = descripcion;
  this.fotoPerfil = fotoPerfil;
  this.fotoBanner1=fotoBanner1;
  this.fotoBanner2=fotoBanner2;
  this.fotoBanner3=fotoBanner3;

 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getApellido() {
  return apellido;
 }

 public void setApellido(String apellido) {
  this.apellido = apellido;
 }

 public String getTitulo() {
  return titulo;
 }

 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }

 public String getDescripcion() {
  return descripcion;
 }

 public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
 }

 public String getFotoPerfil() {
  return fotoPerfil;
 }

 public void setFotoPerfil(String fotoPerfil) {
  this.fotoPerfil = fotoPerfil;
 }



 public String getFotoBanner1() {
  return fotoBanner1;
 }

 public void setFotoBanner1(String fotoBanner1) {
  this.fotoBanner1 = fotoBanner1;
 }


 public String getFotoBanner2() {  return fotoBanner2;
 }

 public void setFotoBanner2(String fotoBanner2) {
  this.fotoBanner2 = fotoBanner2;
 }


 public String getFotoBanner3() {
  return fotoBanner3;
 }

 public void setFotoBanner3(String fotoBanner3) {
  this.fotoBanner3 = fotoBanner3;
 }
}
