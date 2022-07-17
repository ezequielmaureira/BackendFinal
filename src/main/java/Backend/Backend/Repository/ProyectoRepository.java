package Backend.Backend.Repository;


import Backend.Backend.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
}

