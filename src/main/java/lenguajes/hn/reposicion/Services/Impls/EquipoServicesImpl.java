package lenguajes.hn.reposicion.Services.Impls;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import lenguajes.hn.reposicion.Entities.Equipos;
import lenguajes.hn.reposicion.Repositories.EquiposRepository;
import lenguajes.hn.reposicion.Services.EquipoServices;
@Service
public class EquipoServicesImpl implements EquipoServices {

	@Autowired
    private EquiposRepository equipoRepository;
	
	@Override
	public Equipos createEquipo(Equipos equipo) {
		equipoRepository.save(equipo);
		return equipo;
	}

	@Override
	public void deleteEquipo(Integer codigoEquipo) {
	CrudRepository<Equipos, Integer> equiposRepository;
    equiposRepository.deleteById(codigoEquipo);
	}

	@Override
	public List<Equipos> listarEquipos() {
        CrudRepository<Equipos, Integer> equiposRepository;
        return (List<Equipos>) equiposRepository.findAll();
    }
	
	@Override 
	public Optional<Equipos> obtenerEquipoPorId(Integer codigoEquipo) {
        CrudRepository<Equipos, Integer> equiposRepository;
        return equiposRepository.findById(codigoEquipo);
    }
	
	
}
