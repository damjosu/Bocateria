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
    private static final int PRECIO_BOCADILLO = 5;

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
     * que están esperando a ser atendidos.
     */
    public void llegaNuevoClienteALaCola(int numeroDeBocadillos) 
    {        
        if (primeraPersonaEnCola.getSiguienteEnLaCola(primeraPersonaEnCola) == null) 
        {
            primeraPersonaEnCola = new Cliente(numeroDeBocadillos);
        }
        else
        {
            Cliente temp = new Cliente(numeroDeBocadillos);
            primeraPersonaEnCola.setSiguienteEnLaCola(temp);
            primeraPersonaEnCola = temp;
        }        
    }
    
    /**
     * Imprime los datos de los clientes que estan a la cola.
     */
    public void visualizaDatosClientesEnCola() 
    {
        while (primeraPersonaEnCola.getSiguienteEnLaCola(primeraPersonaEnCola) != null)
        {
            System.out.println("Cliente " + primeraPersonaEnCola.getNumeroCliente() + ": "
                           + primeraPersonaEnCola.getNumeroDeBocadillos() + " bocadillo/s (" 
                           + (primeraPersonaEnCola.getNumeroDeBocadillos() * PRECIO_BOCADILLO) + ")");
        }
        System.out.println(primeraPersonaEnCola.getSiguienteEnLaCola(primeraPersonaEnCola));
    }
    
    /**
     * Despacha al primer cliente de la cola.
     */
    public void despacharClienteActual() 
    {
    
    }
}
