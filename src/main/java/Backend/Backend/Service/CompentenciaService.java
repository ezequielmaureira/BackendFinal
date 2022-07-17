package Backend.Backend.Service;
import Backend.Backend.Entity.Competencia;
import Backend.Backend.Interfaces.InterCompetencia;
import Backend.Backend.Repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CompentenciaService implements InterCompetencia {


    @Autowired
    private CompetenciaRepository competenciaRepository;


    @Override
    public List<Competencia> getCompetencia(){
        List<Competencia> listaCompetencia=competenciaRepository.findAll();
        return listaCompetencia;

    }


    @Override
    public void saveCompetencia(Competencia comp) {
        competenciaRepository.save(comp);

    }

    @Override
    public void deleteCompetencia(Integer id) {
        competenciaRepository.deleteById(id);

    }

    @Override
    public Competencia findCompetencia(Integer id) {
        Competencia comp= competenciaRepository.findById(id).orElse(null);
        return comp;


    }

}
