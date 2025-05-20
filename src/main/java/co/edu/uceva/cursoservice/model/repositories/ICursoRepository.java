package co.edu.uceva.cursoservice.model.repositories;

import co.edu.uceva.cursoservice.model.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Interface que hereda de JpaRepository para realizar las
 * operaciones de CRUD paginacion y ordenamiento sobre la entidad Producto
 */
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
