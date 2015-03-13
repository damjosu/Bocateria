
/**
 * Clase Cliente
 * @author (Josu) 
 * @version (13/03/2015)
 */
public class Cliente
{
    private int numeroCliente;
    private Cliente siguienteEnLaCola;
    private int numeroDeBocadillos;
    private int numeroClienteActual;

    /**
     * Constructor de la clase Cliente
     */
    public Cliente(int numeroDeBocadillos)
    {
        numeroCliente = 0;
        siguienteEnLaCola = new Cliente(0);
        this.numeroDeBocadillos = numeroDeBocadillos;
        numeroClienteActual = 0;
    }

}
