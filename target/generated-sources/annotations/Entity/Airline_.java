package Entity;

import Entity.Flight;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T13:33:31")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-29T13:20:31")
>>>>>>> 66ea7b145eb10d8e222be610621d32cf648a0fa8
@StaticMetamodel(Airline.class)
public class Airline_ { 

    public static volatile SingularAttribute<Airline, String> name;
    public static volatile CollectionAttribute<Airline, Flight> flightCollection;
    public static volatile SingularAttribute<Airline, Integer> airlineID;

}