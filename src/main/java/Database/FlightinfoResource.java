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
import java.util.logging.Level;
import java.util.logging.Logger;
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
         List<FlightInstance> flights = flightFacade.getAllFlightInstances();
        if (flights == null || flights.size() == 0)
        {
            throw new FlightException();
        }
        System.out.println("test");
        String response = "{";
        response += "\"airline\":\"" + flights.get(0).getFlight().getAirline().getName() +"\",\"flights\": [";
        for (FlightInstance fl : flights)
        {
            if(fl != flights.get(0))
            {
                response += ",";
            }
            response += "{";
            response += "\"flightID\":\"" + fl.getFlight().getFlightID() + "\",";
            response += "\"flightNumber\":\"" + fl.getFlight().getFlightNumber() + "\",";
            
            response += "\"date\":\""+(1900+fl.getDateAndTime().getYear())+"-"+(fl.getDateAndTime().getMonth() +1)+"-"+fl.getDateAndTime().getDate()+"T00:00:00.000Z\",";
            response += "\"numberofseats\":\""+fl.getFlight().getSeats()+"\",";
            response += "\"totalPrice\":\""+(fl.getPrice() * 1) +"\",";
            response += "\"traveltime\":\""+fl.getFlight().getFlightTimeAirline() +"\",";
            response += "\"origin\":\""+fl.getFlight().getfromAirport().getIATACode()+"\",";
            response += "\"destination\":\""+fl.getFlight().gettooAirport().getIATACode()+"\"";
            
            response += "}";
        }
        response += "]}";
        System.out.println(response);
        
        return response;
    }

     
    @GET
    @Path("{from}/{date}/{tickets}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public String getFlightsWithFromDateTickets(@PathParam("from") String from, @PathParam("date") String date, @PathParam("tickets") int tickets) throws RuntimeException, FlightException, NotFoundException
    {
        String[] strArr = date.split("T");
        strArr = strArr[0].split("-");
        Date dateDate = new Date ((Integer.parseInt(strArr[0])-1900),(Integer.parseInt(strArr[1])-1),Integer.parseInt(strArr[2]));
        System.out.println(date.toString()); 
         List<FlightInstance> flights = flightFacade.getFlightsWithFromDateTickets(from, dateDate, tickets);
        if (flights == null || flights.size() == 0)
        {
            throw new FlightException();
        }
        System.out.println("test");
        String response = "{";
        response += "\"airline\":\"" + flights.get(0).getFlight().getAirline().getName() +"\",\"flights\": [";
        for (FlightInstance fl : flights)
        {
            if(fl != flights.get(0))
            {
                response += ",";
            }
            response += "{";
            response += "\"flightID\":\"" + fl.getFlight().getFlightID() + "\",";
            response += "\"flightNumber\":\"" + fl.getFlight().getFlightNumber() + "\",";
            
            response += "\"date\":\""+(1900+dateDate.getYear())+"-"+(dateDate.getMonth() +1)+"-"+dateDate.getDate()+"T00:00:00.000Z\",";
            response += "\"numberofseats\":\""+fl.getFlight().getSeats()+"\",";
            response += "\"totalPrice\":\""+(fl.getPrice() * tickets) +"\",";
            response += "\"traveltime\":\""+fl.getFlight().getFlightTimeAirline() +"\",";
            response += "\"origin\":\""+fl.getFlight().getfromAirport().getIATACode()+"\",";
            response += "\"destination\":\""+fl.getFlight().gettooAirport().getIATACode()+"\"";
            
            response += "}";
        }
        response += "]}";
        System.out.println(response);
        
        return response;
    }
    public static void main(String[] args) {
        try {
            System.out.println(new FlightinfoResource().getFlightsWithFromDateTickets("CPH", "2017-01-08T00:00:00.000Z", 1));
        } catch (RuntimeException ex) {
            Logger.getLogger(FlightinfoResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FlightException ex) {
            Logger.getLogger(FlightinfoResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
