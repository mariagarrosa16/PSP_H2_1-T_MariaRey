package psp;


import java.util.List;

//clase que representa un cliente  que busca informacion en un servidor
public class Cliente extends Thread {
    private final Servidor servidor; //llama al servidor
    private final String palabraClave;//palabra cvale que quiere el cliente
//constructor que recibe al servidro y la palbra clave
    public Cliente(Servidor servidor, String palabraClave) {
        this.servidor = servidor;
        this.palabraClave = palabraClave;
    }

    //el metodo run que es el que ejecuta cuando el hilo comienza a funcionar
    public void run() {
    	//llamamos al servidor para procesar la solicitud de la plabra clave
        List<String> resultado = servidor.procesarSolicitud(palabraClave);
        System.out.println("Resultados para la palabra clave '" + palabraClave + "':");
        for (String linea : resultado) {
            System.out.println(linea);
        }
    }
}
