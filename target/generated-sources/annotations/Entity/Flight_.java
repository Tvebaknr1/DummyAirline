package Entity;

import Entity.Airline;
import Entity.Airport;
import Entity.FlightInstance;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T12:51:02")
@StaticMetamodel(Flight.class)
public class Flight_ { 

    public static volatile SingularAttribute<Flight, Airport> tooAirport;
    public static volatile SingularAttribute<Flight, Integer> flightID;
    public static volatile SingularAttribute<Flight, Integer> flightTimeAirline;
    public static volatile CollectionAttribute<Flight, FlightInstance> flightInstanceCollection;
    public static volatile SingularAttribute<Flight, Airline> airline;
    public static volatile SingularAttribute<Flight, Integer> seats;
    public static volatile SingularAttribute<Flight, Airport> fromAirport;
    public static volatile SingularAttribute<Flight, String> flightNumber;

}