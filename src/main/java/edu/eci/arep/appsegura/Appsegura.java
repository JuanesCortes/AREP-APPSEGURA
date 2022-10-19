package edu.eci.arep.appsegura;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.secure;
/**
 *
 * @author juan.cortes-p
 */
public class Appsegura {

    public static void main(String[] args){
        
        port(5000);
        secure("keystores/ecikeystore.p12", "12345678", null, null);
        get("/hello", (req, res) -> "Hello World");
    }
}