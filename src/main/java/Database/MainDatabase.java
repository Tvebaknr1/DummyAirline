
package Database;
import REST.FlightFacade;
import java.util.Date;
import javax.persistence.Persistence;

public class MainDatabase
{

    public static void main(String[] args)
    {
        Persistence.generateSchema("Airline", null);
        FlightFacade f = new FlightFacade(Persistence.createEntityManagerFactory("Airline"));

        f.getAllFlights();
        
        Date date = new Date(2012-1900,01,28);
        f.getFlightsWithFromDateTickets("1", date, 2);
    }
}
