package co.edu.uceva.cursoservice.controllers;


import co.edu.uceva.cursoservice.model.entities.Curso;
import co.edu.uceva.cursoservice.model.services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/curso-service")
public class CursoRestController {

    // Inyección de dependencia del servicio que proporciona servicios de CRUD
    private ICursoService cursoService;

    // Inyección de dependencia del servicio que proporciona servicios de CRU
    @Autowired
    public CursoRestController(ICursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Metodo que retorna todos los productos
    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        return cursoService.findAll();
    }

    // Metodo que guarda un producto pasandolo por el cuerpo de la petición
    @PostMapping("/cursos")
    public Curso saveCurso(@RequestBody Curso curso){
        return cursoService.save(curso);
    }

    // Metodo que elimina un producto pasandolo por el cuerpo de la petición
    @DeleteMapping("/cursos")
    public void delete(@RequestBody Curso curso){
        cursoService.delete(curso);
    }

    // Metodo que actualiza un producto pasandolo por el cuerpo de la petición
    @PutMapping("/cursos")
    public Curso update(@RequestBody Curso curso) {
        return this.cursoService.update(curso);
    }

    // Metodo que retorna un producto por su id pasado por la URL
    @GetMapping("/cursos/{id}")
    public Curso findById(@PathVariable("id") Long id){
        return cursoService.findById(id);
    }
}
