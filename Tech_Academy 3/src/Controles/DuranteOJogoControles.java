package Controles;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import spark.Route;

public class DuranteOJogoControles implements Route {
    private final Gson gson;

    public DuranteOJogoControles(Gson gson) {
        this.gson = gson;
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return "Implementar a Rota";
    }
}