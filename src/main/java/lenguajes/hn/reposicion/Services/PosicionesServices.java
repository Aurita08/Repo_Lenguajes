package lenguajes.hn.reposicion.Services;

import java.util.List;
import java.util.Optional;

import lenguajes.hn.reposicion.Entities.Equipos;
import lenguajes.hn.reposicion.Entities.Posiciones;

public interface PosicionesServices {
    
public Posiciones crearPosicion(Posiciones posicion);
public void eliminarPosicion(Integer id);
public List<Posiciones> listarPosiciones();
public Optional<Posiciones> obtenerPosicionPorId(Integer id);
public Optional<Posiciones> obtenerPosicionPorEquipo(Equipos equipo);

}