
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
    private static int numeroClienteActual = 0;

    /**
     * Constructor de la clase Cliente
     * @param numeroDeBocadillos el número de bocadillos que pide el cliente.
     */
    public Cliente(int numeroDeBocadillos)
    {
        numeroCliente = numeroClienteActual;
        numeroClienteActual += 1;
        this.numeroDeBocadillos = numeroDeBocadillos;
    }
    
    /**
     * Muestra el número del cliente.
     */
    public int getNumeroCliente() 
    {
        return numeroCliente;
    }
    
    /**
     * Muestra el número de bocadillos que ha pedido el cliente.
     */
    public int getNumeroDeBocadillos() 
    {
        return numeroDeBocadillos;
    }
    
    /**
     * Pone al siguiente cliente a la cola.
     * @param el cliente que se pone en cola.
     */
    public void setSiguienteEnLaCola(Cliente cliente) 
    {
        siguienteEnLaCola = cliente;
    }
    
    /**
     * Te devuelve el siguiente cliente en la cola al cliente especificado. 
     * @param cliente El cliente siguiente en la cola.
     */
    public Cliente getSiguienteEnLaCola(Cliente cliente) 
    {
        return siguienteEnLaCola;
    }
}
