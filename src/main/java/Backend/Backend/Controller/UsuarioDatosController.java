package Backend.Backend.Controller;


import Backend.Backend.Entity.UsuarioDatos;
import Backend.Backend.Interfaces.InterUsuarioDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="https://porfolioezequiel.firebaseapp.com/")

public class UsuarioDatosController {

   @Autowired
    private InterUsuarioDatos interUsuario;
   @GetMapping("/usuario/traer")
    public List<UsuarioDatos> getUsuario(){

       return interUsuario.getUsuario();
   }

   @GetMapping ("/usuario/traer/{id}")
   public UsuarioDatos findUsuario(@PathVariable Integer id){
       UsuarioDatos user=interUsuario.findUsuario(id);
       return user; 
   }    


  @PostMapping("/usuario/crear")
    public String crearUsuario(@RequestBody UsuarioDatos user){
       interUsuario.saveUsuario(user);
       return "se creo el usuario";


  }
  @DeleteMapping("usuario/borrar/{id}")

    public String deleteUsuario(@PathVariable Integer id){

       interUsuario.deleteUsuario(id);
       return "el usuario fue borrado";

  }

  @PutMapping("usuario/editar/{id}")
    public void UpdateUsuario (@RequestBody UsuarioDatos detalleUsuario){

   interUsuario.saveUsuario(detalleUsuario);




  }




}
