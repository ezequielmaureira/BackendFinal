package Backend.Backend.Controller;

import Backend.Backend.Entity.Experiencia;
import Backend.Backend.Interfaces.InterExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="https://porfolioezequiel.firebaseapp.com/")

public class        ExperienciaController {


    @Autowired
    private InterExperiencia interExperiencia;
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia(){

        return interExperiencia.getExperiencia();
    }

    @GetMapping ("/experiencia/traer/{id}")
    public Experiencia findExperiencia(@PathVariable Integer id){
        Experiencia exp=interExperiencia.findExperiencia(id);
        return exp;
    }


    @PostMapping("/experiencia/crear")
    public void  crearExperiencia(@RequestBody Experiencia exp){

        interExperiencia.saveExperiencia(exp);



    }   
    @DeleteMapping("experiencia/borrar/{id}")

    public void deleteExperiencia(@PathVariable Integer id){

        interExperiencia.deleteExperiencia(id);


    }

    @PutMapping("experiencia/editar/{id}")
    public void UpdateExperiencia(@RequestBody Experiencia detalleExperiencia){

        interExperiencia.saveExperiencia(detalleExperiencia);




    }




}


