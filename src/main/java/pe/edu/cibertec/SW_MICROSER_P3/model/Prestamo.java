package pe.edu.cibertec.SW_MICROSER_P3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "prestamo")
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idmiembro", nullable = false)
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "idlibro", nullable = false)
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String motivo;
}

