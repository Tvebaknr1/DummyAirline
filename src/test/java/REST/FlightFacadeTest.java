
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Emil
 */
public class FlightFacadeTest
{

    public FlightFacadeTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getAllFlights method, of class FlightFacade.
     */

    @Test
    public void testGetFlightsWithFromDateTickets()
    {
        FlightFacade instance = new FlightFacade();
        int result = instance.getFlightsWithFromDateTickets("CPH", new Date(2012-1900, 1-1, 28), 0).get(0).getFlightInstanceID();
        int expResult = 1;
        assertEquals(expResult, result);
    }
}

