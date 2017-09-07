package cloud.proj.dimayor.com;

/**
 * @author Carlos Ocampo
 *
 */
public class Equipo {

	private String nombre;
	private int ano_fun;
	private int titulos;

	public Equipo(String name, int ano, int titu) {

		nombre = name;
		ano_fun = ano;
		titulos = titu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAno_fun() {
		return ano_fun;
	}

	public void setAno_fun(int ano_fun) {
		this.ano_fun = ano_fun;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

}
