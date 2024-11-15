package psp;
//clase principal donde se simula la interaccion entre varios clientes y el servidor
public class Main {
	public static void main(String[] args) {
        Servidor servidor = new Servidor();

        //creamos varios hilos que simulan a los clientes que buscan informacion
        Cliente cliente1 = new Cliente(servidor, "java");
        Cliente cliente2 = new Cliente(servidor, "redes");
        Cliente cliente3 = new Cliente(servidor, "psp");

        //iniciamos los hiloa
        cliente1.start();
        cliente2.start();
        cliente3.start();
    }
}
