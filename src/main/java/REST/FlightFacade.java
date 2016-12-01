package REST;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Entity.Flight;
import Entity.FlightInstance;
import java.sql.Date;
import java.util.ArrayList;
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
    public List<FlightInstance> getAllFlightInstances() {

        EntityManager em = emf.createEntityManager();

        List<FlightInstance> flight = null;

        try {
            em.getTransaction().begin();
            flight = em.createQuery("SELECT f FROM FlightInstance f").getResultList();
            em.getTransaction().commit();
            return flight;
        } finally {
            em.close();
        }
    }
    public List<FlightInstance> getFlightsWithFromDateTickets(String from, Date date, int tickets) {
        System.out.println("test 3");
        List<FlightInstance> AllFlights = this.getAllFlightInstances();
        List<FlightInstance> SortedFlights = new ArrayList<>();
        for (FlightInstance AllFlight : AllFlights) {
            if(AllFlight.getDateAndTime().after(date)&&AllFlight.getFlight().getfromAirport().getIATACode().equals(from)&&AllFlight.getavailableSeats()>=tickets)
            {
                System.out.println("test 5");
                SortedFlights.add(AllFlight);
            }
        }
        return SortedFlights;
    }
}
