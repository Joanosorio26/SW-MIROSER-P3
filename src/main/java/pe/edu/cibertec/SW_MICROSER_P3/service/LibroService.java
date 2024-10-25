package pe.edu.cibertec.SW_MICROSER_P3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.SW_MICROSER_P3.model.Libro;
import pe.edu.cibertec.SW_MICROSER_P3.repository.LibroRepository;
import pe.edu.cibertec.SW_MICROSER_P3.service.interfaces.ILibroService;

import java.util.Optional;
@RequiredArgsConstructor
@Service
public class LibroService implements ILibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    @Transactional
    public Libro registrarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    @Transactional
    public Libro actualizarLibro(Integer id, Libro libroActualizado) {
        Optional<Libro> libroOptional = libroRepository.findById(id);
        if (libroOptional.isPresent()) {
            Libro libroExistente = libroOptional.get();
            libroExistente.setTitulo(libroActualizado.getTitulo());
            libroExistente.setAutor(libroActualizado.getAutor());
            libroExistente.setPrecio(libroActualizado.getPrecio());
            return libroRepository.save(libroExistente);
        } else {
            throw new RuntimeException("Libro no encontrado");
        }
    }
}

