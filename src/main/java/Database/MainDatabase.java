
package Database;
import REST.FlightFacade;
import java.sql.Date;
import javax.persistence.Persistence;

public class MainDatabase
{

    public static void main(String[] args)
    {
        Persistence.generateSchema("Airline", null);
        FlightFacade f = new FlightFacade(Persistence.createEntityManagerFactory("Airline"));

        f.getAllFlights();
        System.out.println(f.getFlightsWithFromDateTickets("TestCode1", new Date(2012-01-28), 2));
        
    }
}
