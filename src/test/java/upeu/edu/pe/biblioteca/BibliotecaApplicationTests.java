package upeu.edu.pe.biblioteca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import upeu.edu.pe.biblioteca.daoImpl.DetallePrestamoDaoImpl;
import upeu.edu.pe.biblioteca.daoImpl.PrestamoDaoImpl;
import upeu.edu.pe.biblioteca.entity.Detalle;
import upeu.edu.pe.biblioteca.entity.Prestamo;


@SpringBootTest
class BibliotecaApplicationTests {

	@Autowired
	private PrestamoDaoImpl daoImpl;

	@Autowired
	private DetallePrestamoDaoImpl dao;
	@Test
	void contextLoads() {
	   // System.out.println(daoImpl.create(new Prestamo(0,"2022/09/21","2022/09/21",1,1)));
		System.out.println(dao.create(new Detalle(0,2,1)));
	}

}
