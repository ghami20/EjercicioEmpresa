
public class Departamento {

	private String nombre;
	private int cantidadEmpleados;
	private Empresa empresa;
	private int bono;
	public Departamento(String nombre, int cantidadEmpleados, Empresa empresa, int bono) {
		this.nombre = nombre;
		this.cantidadEmpleados = cantidadEmpleados;
		this.empresa = empresa;
		this.bono = bono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getBono() {
		return bono;
	}
	public void setBono(int bono) {
		this.bono = bono;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", cantidadEmpleados=" + cantidadEmpleados + ", empresa=" + empresa
				+ ", bono=" + bono + "]";
	}
	
}
