package Backend.Backend.Service;

import Backend.Backend.Entity.Educacion;
import Backend.Backend.Interfaces.InterEducacion;
import Backend.Backend.Repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class EducacionService implements InterEducacion {


    @Autowired
    private EducacionRepository educacionRepository;


    @Override
    public List<Educacion> getEducacion(){
        List<Educacion> listaEducacion=educacionRepository.findAll();
        return listaEducacion;

    }


    @Override
    public void saveEducacion(Educacion edu) {
        educacionRepository.save(edu);

    }

    @Override
    public void deleteEducacion(Integer id) {
        educacionRepository.deleteById(id);

    }

    @Override
    public Educacion findEducacion(Integer id) {
        Educacion edu= educacionRepository.findById(id).orElse(null);
        return edu;


    }

}




