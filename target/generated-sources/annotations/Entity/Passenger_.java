package Entity;

import Entity.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T13:33:31")
@StaticMetamodel(Passenger.class)
public class Passenger_ { 

    public static volatile SingularAttribute<Passenger, String> firstname;
    public static volatile SingularAttribute<Passenger, Integer> passengerID;
    public static volatile SingularAttribute<Passenger, Reservation> reservation;
    public static volatile SingularAttribute<Passenger, String> lastname;

}