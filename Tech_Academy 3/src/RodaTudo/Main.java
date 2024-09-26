package RodaTudo;
import com.google.gson.Gson;
import Controles.DuranteOJogoControles;
import Controles.AntesDoJogoControles;
import spark.Spark;

public class Main {
        private static final Gson gson = new Gson();

        public static void main(String[] args) {
            Spark.get("/:comando", new AntesDoJogoControles(gson));
            Spark.get("/:comando/:save", new DuranteOJogoControles(gson));
//            Spark.port(4567);
        }
    }

