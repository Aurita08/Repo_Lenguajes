package lenguajes.hn.reposicion.Services;

import java.util.List;
import java.util.Optional;

import lenguajes.hn.reposicion.Entities.Equipos;

public interface EquipoServices  {
    public interface EquiposSevice {

	public Equipos createEquipo(Equipos equipo);
	
	public void deleteEquipo(Integer codigoEquipo);
	public List<Equipos> listarEquipos();
	
	public Optional<Equipos> obtenerEquipoPorId(Integer codigoEquipo);
}

}
