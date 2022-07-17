package Backend.Backend.Interfaces;

import Backend.Backend.Entity.Competencia;


import java.util.List;

public interface InterCompetencia {


    public List<Competencia> getCompetencia();
    public void saveCompetencia (Competencia comp);
    public void  deleteCompetencia ( Integer id);
    public Competencia findCompetencia(Integer id);


}
