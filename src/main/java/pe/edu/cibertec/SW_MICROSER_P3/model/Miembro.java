package pe.edu.cibertec.SW_MICROSER_P3.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "miembro")
@NoArgsConstructor
@AllArgsConstructor
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String direccion;
    private String telefono;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
}
