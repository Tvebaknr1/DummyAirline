/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import Entity.Flight;
import java.util.List;
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
        List<Flight> expResult = null;
        List<Flight> result = instance.getAllFlights();
        assertEquals(expResult, result);
    }
    
}
