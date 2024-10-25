package pe.edu.cibertec.SW_MICROSER_P3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.SW_MICROSER_P3.model.Libro;
import pe.edu.cibertec.SW_MICROSER_P3.service.interfaces.ILibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private ILibroService libroService;

    @PostMapping("/registrar")
    public ResponseEntity<Libro> registrarLibro(@RequestBody Libro libro) {
        Libro libroGuardado = libroService.registrarLibro(libro);
        return ResponseEntity.ok(libroGuardado);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Libro> actualizarLibro(@PathVariable Integer id, @RequestBody Libro libroActualizado) {
        Libro libroModificado = libroService.actualizarLibro(id, libroActualizado);
        return ResponseEntity.ok(libroModificado);
    }
}