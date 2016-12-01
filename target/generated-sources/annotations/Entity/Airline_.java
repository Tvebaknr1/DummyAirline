package Entity;

import Entity.Flight;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T13:33:31")
@StaticMetamodel(Airline.class)
public class Airline_ { 

    public static volatile SingularAttribute<Airline, String> name;
    public static volatile CollectionAttribute<Airline, Flight> flightCollection;
    public static volatile SingularAttribute<Airline, Integer> airlineID;

}