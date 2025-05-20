package co.edu.uceva.cursoservice.model.services;

import co.edu.uceva.cursoservice.model.entities.Curso;

import java.util.List;

/**
 * Interface que define los métodos que se pueden realizar sobre la entidad Producto
 */
public interface ICursoService {
    Curso save(Curso curso);
    void delete(Curso curso);
    Curso findById(Long id);
    Curso update(Curso curso);
    List<Curso> findAll();
}
