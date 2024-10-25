package pe.edu.cibertec.SW_MICROSER_P3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.SW_MICROSER_P3.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
