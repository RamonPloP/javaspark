import static spark.Spark.*;

public class Main{

    public static void main(String[] args) {
        port(4000);
        
        post("/users", (req, res) -> {
            String id = req.queryParams("id");
            return "Usuario creado";
        });
        
        get("/users/:id", (req, res) -> {
        	String id = req.params("id");
        	return "Usuario con id: " + req.params("id");
        });
   
        get("/users", (req, res) -> "Lista de Usuarios: ");

        put("/users/:id", (req, res) -> {
            String id = req.params(":id");
            return "ID: "+id+" actualizado";
        });

	patch("/users/:id", (req, res) -> {
            String id = req.params(":id");
            return "Usuario reemplazado con id: "+id;
        });

        delete("/users/:id", (req, res) -> {
            String id = req.params(":id");
            return "ID: " + id + " eliminado";
        });
    }
}
