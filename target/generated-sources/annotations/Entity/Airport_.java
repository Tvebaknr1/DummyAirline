package Entity;

import Entity.Flight;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-01T11:05:34")
@StaticMetamodel(Airport.class)
public class Airport_ { 

    public static volatile SingularAttribute<Airport, String> country;
    public static volatile SingularAttribute<Airport, String> IATACode;
    public static volatile SingularAttribute<Airport, String> city;
    public static volatile CollectionAttribute<Airport, Flight> flightCollection1;
    public static volatile SingularAttribute<Airport, Integer> airportID;
    public static volatile SingularAttribute<Airport, String> name;
    public static volatile SingularAttribute<Airport, String> timeZone;
    public static volatile CollectionAttribute<Airport, Flight> flightCollection;

}