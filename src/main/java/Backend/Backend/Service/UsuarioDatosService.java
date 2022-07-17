package Backend.Backend.Service;

import Backend.Backend.Entity.UsuarioDatos;
import Backend.Backend.Interfaces.InterUsuarioDatos;
import Backend.Backend.Repository.UsuarioDatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class UsuarioDatosService implements InterUsuarioDatos {

    @Autowired
    private UsuarioDatosRepository usuarioRepository;


    @Override
    public List<UsuarioDatos> getUsuario(){
        List<UsuarioDatos> listaUsuario=usuarioRepository.findAll();
        return listaUsuario;

    }


    @Override
    public void saveUsuario(UsuarioDatos user) {
        usuarioRepository.save(user);

    }

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);

    }

    @Override
    public UsuarioDatos findUsuario(Integer id) {
      UsuarioDatos user= usuarioRepository.findById(id).orElse(null);
      return user;


    }


}

