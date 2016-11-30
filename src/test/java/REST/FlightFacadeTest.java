/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Airline;
import Entity.Airport;
import Entity.Flight;
import java.util.List;
import org.eclipse.persistence.indirection.IndirectList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emil
 */
public class FlightFacadeTest {
    
    public FlightFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllFlights method, of class FlightFacade.
     */
    @Test
    public void testGetAllFlights() {
        System.out.println("getAllFlights");
        FlightFacade instance = new FlightFacade();
        Flight expResult = null; 
        List<Flight> result = instance.getAllFlights();
        result.get(0).setFlightInstanceCollection(null);
        result.get(0).getAirline().setFlightCollection(null);
        result.get(0).getfromAirport().setFlightCollection(null);
        result.get(0).getfromAirport().setFlightCollection1(null);
        result.get(0).gettooAirport().setFlightCollection(null);
        result.get(0).gettooAirport().setFlightCollection1(null);
        expResult = new Flight("newy001", 200, 5, null, new Airline(1, "TestLine1", null), new Airport("TestCode1", "CET", "Copenhagen Airport", "Denmark", "Copenhagen", null, null), new Airport("TestCode2", "EST", "john f kennedy international airport", "USA", "New York", null, null));
        assertEquals(expResult.toString(), result.get(0).toString());
    }
    
}
