package pe.edu.cibertec.SW_MICROSER_P3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.SW_MICROSER_P3.model.Miembro;
import pe.edu.cibertec.SW_MICROSER_P3.service.interfaces.IMiembroService;

@RestController
@RequestMapping("/miembros")
@RequiredArgsConstructor
public class MiembroController {

    @Autowired
    private final IMiembroService miembroService;

    @PostMapping("/insertar")
    public ResponseEntity<Miembro> insertarMiembro(@RequestBody Miembro miembro) {
        Miembro nuevoMiembro = miembroService.insertarMiembro(miembro);
        return ResponseEntity.ok(nuevoMiembro);
    }
}