package Backend.Backend.Interfaces;

import Backend.Backend.Entity.Experiencia;


import java.util.List;

public interface InterExperiencia {


    public List<Experiencia> getExperiencia();
    public void saveExperiencia (Experiencia exp);
    public void  deleteExperiencia ( Integer id);
    public Experiencia findExperiencia(Integer id);



}
