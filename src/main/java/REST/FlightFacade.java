package REST;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Entity.Flight;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LouiseB
 */
public class FlightFacade {

    EntityManagerFactory emf;

    public FlightFacade() {
        this.emf = Persistence.createEntityManagerFactory("Airline");
    }

    public FlightFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<Flight> getAllFlights() {

        EntityManager em = emf.createEntityManager();

        List<Flight> flight = null;

        try {
            em.getTransaction().begin();
            flight = em.createQuery("SELECT f FROM Flight f").getResultList();
            em.getTransaction().commit();
            System.out.println(flight);
            return flight;
        } finally {
            em.close();
        }
    }

    public List<Flight> getFlightsWithFromDateTickets(String from, Date date, int tickets)
    {
        
        EntityManager em = emf.createEntityManager();

        List<Flight> flight = null;
        
        try
        {
            em.getTransaction().begin();
            flight = em.createQuery("SELECT f FROM Flight f NATURAL JOIN f.FlightInstance i WHERE f.fromAirport = " + from 
                    + " AND i.dateAndTime = " + date + " AND f.seats = " + tickets).getResultList();
            em.getTransaction().commit();
            System.out.println(flight);
            return flight;
        } finally
        {
            em.close();
        }
    }

//    public List<Flight> getFlightsWithFromToDateTickets(String to, String From, Date date, int tickets)
//    {
//
//    }
//
//    public Reservation postReservationWithFlightIdPassengers(List<Passenger> passenger, int flightId)
//    {
//
//    }
}
