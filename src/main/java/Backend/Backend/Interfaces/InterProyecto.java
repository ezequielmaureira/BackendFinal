package Backend.Backend.Interfaces;

import Backend.Backend.Entity.Proyecto;


import java.util.List;
public interface InterProyecto {

    public List<Proyecto> getProyecto();
    public void saveProyecto (Proyecto proy);
    public void  deleteProyecto ( Integer id);
    public Proyecto findProyecto(Integer id);

}
