
package Database;
import REST.FlightFacade;
import javax.persistence.Persistence;

public class MainDatabase
{

    public static void main(String[] args)
    {
        Persistence.generateSchema("Airline", null);
        FlightFacade f = new FlightFacade(Persistence.createEntityManagerFactory("Airline"));

        f.getAllFlights();
        
    }
}
