package co.edu.uceva.cursoservice.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Curso {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "El campo 'activo' es obligatorio")
    private Boolean activo;
    @NotNull(message = "El campo 'cuposDisponiles' es obligatorio")
    private Byte cuposDisponibles;
    @NotNull(message = "El campo 'descripcion' es obligatorio")
    private String descripcion;
    @NotNull(message = "El campo 'duracion' es obligatorio")
    private Integer duracion;
    @NotNull(message = "El campo 'fechaCreacion' es obligatorio")
    private LocalDate fechaCreacion;
    @NotNull(message = "El campo 'horario' es obligatorio")
    private String horario;
    @NotNull(message = "El campo 'idDocente' es obligatorio")
    private Long idDocente;
    @NotNull(message = "El campo 'idSemestre' es obligatorio")
    private Long idSemestre;
    @NotNull(message = "El campo 'modalidad' es obligatorio")
    private String modalidad;
    @NotNull(message = "El campo 'nombre' es obligatorio")
    private String nombre;
    @NotNull(message = "El campo 'numeroCreditos' es obligatorio")
    private Byte numeroCreditos;
}
