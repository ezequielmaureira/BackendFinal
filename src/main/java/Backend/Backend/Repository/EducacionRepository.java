package Backend.Backend.Repository;


import Backend.Backend.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
}