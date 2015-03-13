import java.util.HashMap;
/**
 * Clase Bocateria.
 * @author (Josu) 
 * @version (13/03/2015)
 */
public class Bocateria
{
    private Cliente primeraPersonaEnCola;
    private int facturacionActual;
    private HashMap<Integer, Cliente> clientesDespachados;
    private static final int PRECIO_BOCADILLO = 20;

    /**
     * Constructor de la clase Bocateria
     */
    public Bocateria()
    {
        primeraPersonaEnCola = new Cliente(0);
        facturacionActual = 0;
        clientesDespachados = new HashMap<>();
    }
    
    /**
     * Llega un nuevo cliente que se pone a la cola de clientes 
     * que están esperando a ser atendidos
     */
    public void llegaNuevoClienteALaCola(int numeroDeBocadillos) 
    {
        primeraPersonaEnCola = new Cliente(numeroDeBocadillos);
    }
}
