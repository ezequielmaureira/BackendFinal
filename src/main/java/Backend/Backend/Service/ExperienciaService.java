package Backend.Backend.Service;

import Backend.Backend.Entity.Experiencia;
import Backend.Backend.Interfaces.InterExperiencia;
import Backend.Backend.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ExperienciaService implements InterExperiencia {


    @Autowired
    private ExperienciaRepository experienciaRepository;


    @Override
    public List<Experiencia> getExperiencia(){
        List<Experiencia> listaExperiencia=experienciaRepository.findAll();
        return listaExperiencia;

    }


    @Override
    public void saveExperiencia(Experiencia exp) {
        experienciaRepository.save(exp);

    }

    @Override
    public void deleteExperiencia(Integer id) {
        experienciaRepository.deleteById(id);

    }

    @Override
    public Experiencia findExperiencia(Integer id) {
        Experiencia exp= experienciaRepository.findById(id).orElse(null);
        return exp;


    }

}
