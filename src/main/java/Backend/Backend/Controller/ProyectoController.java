package Backend.Backend.Controller;

import Backend.Backend.Entity.Proyecto;
import Backend.Backend.Interfaces.InterProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class ProyectoController {


    @Autowired
    private InterProyecto interProyecto;
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto(){

        return interProyecto.getProyecto();
    }

    @GetMapping ("/proyecto/traer/{id}")
    public Proyecto findProyecto(@PathVariable Integer id){
       Proyecto proy=interProyecto.findProyecto(id);
        return proy;
    }


    @PostMapping("/proyecto/crear")
    public void  crearProyecto(@RequestBody Proyecto proy){

        interProyecto.saveProyecto(proy);



    }
    @DeleteMapping("proyecto/borrar/{id}")

    public void deleteProyecto(@PathVariable Integer id){

        interProyecto.deleteProyecto(id);


    }

    @PutMapping("proyecto/editar/{id}")
    public void UpdateProyecto(@RequestBody Proyecto detalleProyecto){

        interProyecto.saveProyecto(detalleProyecto);




    }




}

