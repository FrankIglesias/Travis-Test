

public class Materia {

	private String nombre;
	private int parcial1;
	private int parcial2;

	public Materia(String nombreMateria) {
		this.nombre = nombreMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public int getParcial1() {
		return parcial1;
	}

	public int getParcial2() {
		return parcial2;
	}

	public boolean puedePromocionar() {
		return parcial1 >= 8 && parcial2 >= 8;
	}
}
