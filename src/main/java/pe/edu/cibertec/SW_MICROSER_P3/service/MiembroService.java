package pe.edu.cibertec.SW_MICROSER_P3.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.SW_MICROSER_P3.model.Miembro;
import pe.edu.cibertec.SW_MICROSER_P3.repository.MiembroRepository;
import pe.edu.cibertec.SW_MICROSER_P3.service.interfaces.IMiembroService;

@RequiredArgsConstructor
@Service
public class MiembroService implements IMiembroService {


    @Autowired
    private final MiembroRepository miembroRepository;

    @Override
    @Transactional
    public Miembro insertarMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }
}