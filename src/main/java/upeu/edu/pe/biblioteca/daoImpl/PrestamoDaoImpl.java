package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Prestamo;

@Component
public class PrestamoDaoImpl implements Operaciones<Prestamo>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO 	prestamo (idprestamo, fecha_pres, fecha_dev, idempleado, idalumno) values("
				+ " 0, now(), ?, ?,?)";
		return jdbcTemplate.update(SQL, t.getFecha_dev(), t.getIdempleado(), t.getIdcliente());
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "select p.idprestamo, e.usuario as empleado, concat(c.nombre,' ',c.apellido) as alumno from prestamo as p "
				+ "inner join empleado as e on p.idempleado = e.idempleado "
				+ "inner join alumno as c on p.idalumno = c.idalumno";
		return jdbcTemplate.queryForList(SQL);
	}
	
}
