/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entity.Flight;
import REST.FlightFacade;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Emil
 */
@Path("flightinfo")
public class FlightinfoResource {

    FlightFacade flightFacade = new FlightFacade();

    @Context
    private UriInfo context;

    public FlightinfoResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getFlightsWithFromDateTickets()
    {
        List<Flight> flights = flightFacade.getAllFlights();
        return new Gson().toJson(flights);
    }
}
