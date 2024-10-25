package pe.edu.cibertec.SW_MICROSER_P3.service.interfaces;

import pe.edu.cibertec.SW_MICROSER_P3.model.Libro;

public interface ILibroService {
    Libro registrarLibro(Libro libro);
    Libro actualizarLibro(Integer id, Libro libroActualizado);
}
