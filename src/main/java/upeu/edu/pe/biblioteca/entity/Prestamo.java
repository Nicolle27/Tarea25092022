package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {

	private int idprestamo;
	private String fecha_pres;
	private String fecha_dev;
	private int idempleado;
	private int idcliente;
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public String getFecha_pres() {
		return fecha_pres;
	}
	public void setFecha_pres(String fecha_pres) {
		this.fecha_pres = fecha_pres;
	}
	public String getFecha_dev() {
		return fecha_dev;
	}
	public void setFecha_dev(String fecha_dev) {
		this.fecha_dev = fecha_dev;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
}
