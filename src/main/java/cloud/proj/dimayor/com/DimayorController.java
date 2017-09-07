package cloud.proj.dimayor.com;

import static cloud.proj.dimayor.com.JsonUtil.*;
import static spark.Spark.*;

public class DimayorController {

	public DimayorController(final PrimeraDivision primera) {

		// Devuelve la lista de equipos
		get("/equipos", (req, res) -> primera.getEquipos(), json());

		// Devuelve el equipo con nombre pasado por el parametro name o erro si
		// no existe
		get("/equipos/:name", (req, res) -> {
			String name = req.params(":name");
			Equipo equipo = primera.getEquipo(name);
			if (equipo != null) {
				res.status(200);
				return equipo;
			}
			res.status(400);
			return new ResponseError("No existe el equipo '%s' ", name);
		}, json());

		// Actualiza la información de un equipo dentro del servidor
		put("/equipos/:name",
				(req, res) -> primera.editEquipo(req.params(":name"), req.queryParams("ano"), req.queryParams("titu")),
				json());

		// Agregar un equipo a la lista de equipos
		post("/equipos", (req, res) -> primera.addEquipo(req.queryParams("name"), req.queryParams("ano"),
				req.queryParams("titu")), json());

		
		//elimina un equipo de la lista
		delete("/equipos", (req, res) -> {
			primera.deleteEquipo(req.queryParams("name"));
			res.status(200);
			return "";
		});

		after((req, res) -> {
			res.type("application/json");
		});

		exception(IllegalArgumentException.class, (e, req, res) -> {
			res.status(400);
			res.body(toJson(new ResponseError(e)));
		});

	}

}
