package Entity;

import Entity.Flight;
import Entity.Reservation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T12:37:01")
@StaticMetamodel(FlightInstance.class)
public class FlightInstance_ { 

    public static volatile SingularAttribute<FlightInstance, Integer> flightInstanceID;
    public static volatile SingularAttribute<FlightInstance, Flight> flight;
    public static volatile SingularAttribute<FlightInstance, Date> dateAndTime;
    public static volatile SingularAttribute<FlightInstance, Integer> price;
    public static volatile SingularAttribute<FlightInstance, Integer> available;
    public static volatile CollectionAttribute<FlightInstance, Reservation> reservationCollection;

}