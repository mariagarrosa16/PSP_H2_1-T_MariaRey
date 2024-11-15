package psp;

import java.util.List;
//clse que actua como un servidor, que preocesa la solictudes de los clientes
public class Servidor {
	  private final AccesoDatos accesoDatos;
	//constructor que inicializa la clase AccesoDatos
	  public Servidor() {
	        this.accesoDatos = new AccesoDatos();
	    }
//metodo que procesa la solicitud  de busqueda de un cliente
	  //recibe la palabra clave y devuelve los rsultados de busqueda
	    public synchronized List<String> procesarSolicitud(String palabraClave) {
	        System.out.println("Procesando solicitud para: " + palabraClave);
	        //llamo al metodo buscarResumen de la calse accesoDatos para obetner los resultados
	        return accesoDatos.buscarResumen(palabraClave);
	    }
    
}