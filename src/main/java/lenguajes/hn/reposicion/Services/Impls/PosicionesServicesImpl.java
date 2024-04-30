package lenguajes.hn.reposicion.Services.Impls;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lenguajes.hn.reposicion.Entities.Equipos;
import lenguajes.hn.reposicion.Entities.Posiciones;
import lenguajes.hn.reposicion.Services.PosicionesServices;

@Service
public class PosicionesServicesImpl implements PosicionesServices {

    @Override
    public Posiciones crearPosicion(Posiciones posicion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearPosicion'");
    }

    @Override
    public void eliminarPosicion(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPosicion'");
    }

    @Override
    public List<Posiciones> listarPosiciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPosiciones'");
    }

    @Override
    public Optional<Posiciones> obtenerPosicionPorId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPosicionPorId'");
    }

    @Override
    public Optional<Posiciones> obtenerPosicionPorEquipo(Equipos equipo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPosicionPorEquipo'");
    }
    
}
