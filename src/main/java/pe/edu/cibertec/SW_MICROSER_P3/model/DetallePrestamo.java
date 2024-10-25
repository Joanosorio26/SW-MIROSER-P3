package pe.edu.cibertec.SW_MICROSER_P3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "detalleprestamo")
@NoArgsConstructor
@AllArgsConstructor
public class DetallePrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idprestamo", nullable = false)
    private Prestamo prestamo;

    @ManyToOne
    @JoinColumn(name = "idlibro", nullable = false)
    private Libro libro;
    private String instrucciones;
}

