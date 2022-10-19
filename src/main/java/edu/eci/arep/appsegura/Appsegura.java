package edu.eci.arep.appsegura;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;
/**
 *
 * @author juan.cortes-p
 */
public class Appsegura {

    public static void main(String... args){
          port(getPort());
          //staticFiles.location("/webapp");
          get("/app",(req,res)  -> {
        	res.type("application/json");
        	
            return "Esta es la cadena ====> "+req.queryParams("name");
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}