package pe.edu.cibertec.SW_MICROSER_P3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bibliotecario")
@NoArgsConstructor
@AllArgsConstructor
public class Bibliotecario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private Categoria categoria;
    private String telefono;
    private String correo;

}
