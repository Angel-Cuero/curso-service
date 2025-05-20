package co.edu.uceva.cursoservice.model.entities.repositories;

import co.edu.uceva.cursoservice.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface que hereda de CrudRepository para realizar las
 * operaciones de CRUD sobre la entidad Producto
 */
public interface ICursoRepository extends CrudRepository<Curso, Long> {
}
