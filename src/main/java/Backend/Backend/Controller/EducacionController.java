package Backend.Backend.Controller;

import Backend.Backend.Entity.Educacion;
import Backend.Backend.Interfaces.InterEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="https://porfolioezequiel.firebaseapp.com/")

public class EducacionController {


    @Autowired
    private InterEducacion interEducacion;
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){

        return interEducacion.getEducacion();
    }

    @GetMapping ("/educacion/traer/{id}")
    public Educacion findEducacion(@PathVariable Integer id){
        Educacion edu=interEducacion.findEducacion(id);
        return edu;
    }


    @PostMapping("/educacion/crear")
    public void  crearEducacion(@RequestBody Educacion edu){

        interEducacion.saveEducacion(edu);



    }
    @DeleteMapping("educacion/borrar/{id}")

    public void deleteEducacion(@PathVariable Integer id){

        interEducacion.deleteEducacion(id);


    }

    @PutMapping("educacion/editar/{id}")
    public void UpdateEducacion(@RequestBody Educacion detalleEducacion){

        interEducacion.saveEducacion(detalleEducacion);




    }




}

