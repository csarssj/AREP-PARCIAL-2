package edu.escuelaing.arep.parcialarep2;
import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
/**
 * Ceseg
 *
 */
public class App 
{
    public static void main(String... args){
        port(getPort());
        get ("hello", (req,res) -> "Hello Docker!");
        get("/ln",(req,res)-> resultLn(req,res));
        get("/exp",(req,res)-> resultExp(req,res));
    }
    /**
     * Puerto por el que se ejecuta la app
     * @return puerto
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }

    /**
     * Encargado de retornar el resultado correspondiendo la euler 
     * @param req request 
     * @param res response
     * @return respuesta del la funcion 
     */
    private static String resultExp(spark.Request req, spark.Response res) {
    	String param = req.queryParams("value");
    	Double ans = Math.exp(new Double(param));
    	System.out.println(param);
    	String pageContent = "{operation: ln, input: "+param+", output: "+ans+"}";
    	//System.out.print(pageContent);
        return pageContent;
    }
    /**
     * Encargado de retornar el resultado correspondiendo la logaritmo
     * @param req request 
     * @param res response
     * @return respuesta del logaritmo
     */
    private static String resultLn(spark.Request req, spark.Response res) {
    	String param = req.queryParams("value");
    	System.out.println(param);
    	Double ans = Math.log(new Double(param));
    	System.out.println(param);
    	String pageContent = "{operation: ln, input: "+param+", output: "+ans+"}";
    	//System.out.print(pageContent);
        return pageContent;
    }
}
