package edu.eci.arep.dockerprimer;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String[] args) {
		Service service = new Service();
		port(getPort());
		System.out.println("Running in "+ getPort() + " port");
		staticFiles.location("/public");
		post("/send", (req, res) -> {
			String message = req.body();
			String newMessage = message.replace("\"", "");
			service.insert(newMessage);
			String messages = service.getData().replace("\n", "");
			return " { \"message\": \""+ messages+ "\"}";
		});
		get("/messages", (req, res) -> {
			return service.getData();
		});
	}

    /**
     * Obtiene el puerto
     * @return int
     */
	public static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567;
	}

}
