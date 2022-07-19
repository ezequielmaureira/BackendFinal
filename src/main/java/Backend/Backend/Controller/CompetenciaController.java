package Backend.Backend.Controller;

import Backend.Backend.Entity.Competencia;
import Backend.Backend.Interfaces.InterCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="https://porfolioezequiel.firebaseapp.com")

public class CompetenciaController {


        @Autowired
        private InterCompetencia interCompetencia;
        @GetMapping("/competencia/traer")
        public List<Competencia> getCompetencia(){

            return interCompetencia.getCompetencia();
        }

        @GetMapping ("/competencia/traer/{id}")
        public Competencia findComptencia(@PathVariable Integer id){
            Competencia comp=interCompetencia.findCompetencia(id);
            return comp;
        }


        @PostMapping("/competencia/crear")
        public void  crearCompetencia(@RequestBody Competencia comp){

            interCompetencia.saveCompetencia(comp);



        }
        @DeleteMapping("competencia/borrar/{id}")

        public void deleteCompetencia(@PathVariable Integer id){

            interCompetencia.deleteCompetencia(id);


        }

        @PutMapping("competencia/editar/{id}")
        public void UpdateCompetencia (@RequestBody Competencia detalleCompetencia){

            interCompetencia.saveCompetencia(detalleCompetencia);




        }




    }

