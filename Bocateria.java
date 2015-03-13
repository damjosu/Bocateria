import java.util.HashMap;
/**
 * Clase Bocateria.
 * @author (Josu) 
 * @version (13/03/2015)
 */
public class Bocateria
{
   private Cliente primeraPersonaEncola;
   private int facturacionActual;
   private HashMap<Integer, Cliente> clientesDespachados;
   private static final int PRECIO_BOCADILLO = 20;

    /**
     * Constructor de la clase Bocateria
     */
    public Bocateria()
    {
        primeraPersonaEncola = new Cliente();
        facturacionActual = 0;
        clientesDespachados = new HashMap<>();
    }

    
}
