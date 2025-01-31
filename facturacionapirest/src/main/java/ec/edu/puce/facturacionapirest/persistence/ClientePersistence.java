package ec.edu.puce.facturacionapirest.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.puce.facturacionapirest.domain.Cliente;
import java.util.List;

public interface ClientePersistence extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
}