package co.edu.uceva.cursoservice.model.services;

import co.edu.uceva.cursoservice.model.entities.Curso;
import co.edu.uceva.cursoservice.model.repositories.ICursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que implementa los métodos de la interfaz IProductoService
 * para realizar las operaciones de negocio sobre la entidad Producto
 */
@Service
public class CursoServiceImpl implements ICursoService{

    ICursoRepository cursoRepository;

    public CursoServiceImpl(ICursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void delete(Curso curso) {
        cursoRepository.delete(curso);
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public Curso update(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return (List<Curso>) cursoRepository.findAll();
    }
}
