package cloud.proj.dimayor.com;

import java.util.ArrayList;

public class PrimeraDivision {

	private ArrayList<Equipo> equipos;

	public PrimeraDivision() {

		equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("America", 1927, 13));
		equipos.add(new Equipo("Nacional", 1947, 16));
		equipos.add(new Equipo("Cali", 1912, 9));
		equipos.add(new Equipo("Millonarios", 1946, 14));

	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	// verificar después si llega un null donde sea utilizado este método
	public Equipo getEquipo(String name) {

		Equipo equipo = null;

		for (int i = 0; i < equipos.size(); i++) {

			if (equipos.get(i).getNombre().equalsIgnoreCase(name)) {
				equipo = equipos.get(i);
				break;

			}
		}

		return equipo;
	}

	public Equipo editEquipo(String name, String ano, String titu) {
		
		Equipo equipo = this.getEquipo(name);
		
		if (equipo == null){
			
			throw new IllegalArgumentException("No hay equipo con nombre " + name );
			
		}

		failIfInvalid(ano, titu);
		equipo.setAno_fun(Integer.parseInt(ano));
		equipo.setTitulos(Integer.parseInt(titu));
		
		return equipo;
	}

	public Equipo addEquipo(String name, String ano, String titu) {

		failIfInvalid(ano, titu);
		Equipo equipo =  new Equipo(name, Integer.parseInt(ano), Integer.parseInt(titu));
		equipos.add(equipo);
		return equipo;

	}

	public void deleteEquipo(String name) {

		Equipo equipo = this.getEquipo(name);
		equipos.remove(equipo);
	}
	
	private void failIfInvalid(String ano, String titu) {
		if (ano == null || ano.isEmpty()) {
			throw new IllegalArgumentException("Parametro año está vacio");
		}
		if (titu == null || titu.isEmpty() ) {
			throw new IllegalArgumentException("Parametro titulos está vacio");
		}
	}
}
