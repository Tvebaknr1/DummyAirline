/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entity.Flight;
import Entity.FlightInstance;
import REST.FlightFacade;
import RESTException.FlightException;
import com.google.gson.Gson;
import java.sql.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
public class FlightinfoResource
{

    FlightFacade flightFacade = new FlightFacade();

    @Context
    private UriInfo context;

    public FlightinfoResource()
    {
    }

    @GET
    @Path("allflights")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllFlights() throws RuntimeException, FlightException, NotFoundException
    {
        List<Flight> flights = flightFacade.getAllFlights();
        if (flights == null)
        {
            throw new FlightException();
        }
        return new Gson().toJson(flights);
    }

     @GET
    @Path("dick")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public String getFlightsWitdickhFromDateTickets()
    {
        return "fuck you";
//        List<FlightInstance> flights = flightFacade.getFlightsWithFromDateTickets(from, date, tickets);
//        return new Gson().toJson(flights);
    }
    @GET
    @Path("{from}/{date}/{tickets}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public String getFlightsWithFromDateTickets(@PathParam("from") String from, @PathParam("date") Date date, @PathParam("tickets") int tickets) throws RuntimeException, FlightException, NotFoundException
    {
        List<FlightInstance> flights = flightFacade.getFlightsWithFromDateTickets(from, date, tickets);
        if (flights == null)
        {
            throw new FlightException();
        }
        return new Gson().toJson(flights);
    }
}
