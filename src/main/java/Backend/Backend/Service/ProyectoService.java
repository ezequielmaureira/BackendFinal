package Backend.Backend.Service;

import Backend.Backend.Entity.Proyecto;
import Backend.Backend.Interfaces.InterProyecto;
import Backend.Backend.Repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProyectoService implements InterProyecto {

    @Autowired
    private ProyectoRepository proyectoRepository;


    @Override
    public List<Proyecto> getProyecto(){
        List<Proyecto> listaProyecto=proyectoRepository.findAll();
        return listaProyecto;

    }


    @Override
    public void saveProyecto(Proyecto proy) {
        proyectoRepository.save(proy);

    }

    @Override
    public void deleteProyecto(Integer id) {
        proyectoRepository.deleteById(id);

    }

    @Override
    public Proyecto findProyecto (Integer id) {
        Proyecto proy= proyectoRepository.findById(id).orElse(null);
        return proy;


    }




}
