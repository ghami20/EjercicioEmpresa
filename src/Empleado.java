
public class Empleado {

	private String nombre;
	private String puesto;
	private Departamento departamento;
	private double salario;
	private int horas;
	public Empleado(String nombre, String puesto, Departamento departamento, double salario, int horas) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.departamento = departamento;
		this.salario = salario;
		this.horas = horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", departamento=" + departamento + ", salario="
				+ salario + ", horas=" + horas + "]";
	}
	
}
