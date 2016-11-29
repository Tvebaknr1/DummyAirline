package Entity;

import Entity.FlightInstance;
import Entity.Passenger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T12:37:01")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Integer> reservationID;
    public static volatile SingularAttribute<Reservation, Integer> totalPrice;
    public static volatile CollectionAttribute<Reservation, Passenger> passengerCollection;
    public static volatile SingularAttribute<Reservation, FlightInstance> flightInstance;

}