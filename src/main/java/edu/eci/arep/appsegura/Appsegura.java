package edu.eci.arep.appsegura;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;
/**
 *
 * @author juan.cortes-p
 */
public class Appsegura {

    public static void main(String[] args){
        
          get("/hello", (req, res) -> "Hello World");
    }

    
}