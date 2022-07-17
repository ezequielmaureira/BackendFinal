package Backend.Backend.Interfaces;

import Backend.Backend.Entity.UsuarioDatos;


import java.util.List;
public interface InterUsuarioDatos {

    public List<UsuarioDatos> getUsuario();
    public void saveUsuario (UsuarioDatos user);
    public void  deleteUsuario ( Integer id);
    public UsuarioDatos findUsuario (Integer id);

}
