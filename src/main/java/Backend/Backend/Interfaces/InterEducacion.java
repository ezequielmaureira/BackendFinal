package Backend.Backend.Interfaces;

import Backend.Backend.Entity.Educacion;


import java.util.List;

public interface InterEducacion {



    public List<Educacion> getEducacion();
    public void saveEducacion(Educacion edu);
    public void  deleteEducacion( Integer id);
    public Educacion findEducacion(Integer id);

}
