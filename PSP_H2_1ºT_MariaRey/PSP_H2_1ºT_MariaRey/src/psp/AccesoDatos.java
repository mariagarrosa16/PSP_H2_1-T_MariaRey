package psp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
//creamos una clase que se llama accesoDatos para poder gestionar la lectura de datos de un archivo de texto
public class AccesoDatos {
	//metodo para recibir una plabra clave y duelve una lista de lineas del arhivo 
	public List<String> buscarResumen(String buscarPalabra){
		List<String> resultado = new ArrayList<>();//lista para lamacenar las lineas que coiciden con la busqueda
		//se abre el arhivo de texto y lo lee linea pot liena  
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\PSP\\PSP_H2_1ºT_MariaRey\\src\\psp\\resumen_psp.txt"))){
		String linea;
		while ((linea = br.readLine()) != null) {
			// si la linea cintiene la palbra clabe se agruega a la lista de rsultado
			if(linea.toLowerCase().contains(buscarPalabra.toLowerCase())) {
				resultado.add(linea);
			}
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
