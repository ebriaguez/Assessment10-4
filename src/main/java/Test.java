import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Bobert", flightCrewJob1, 100000.0f);
        CrewMember crewMember2 = new CrewMember("Emilia", flightCrewJob2, 90000.0f);
        CrewMember crewMember3 = new CrewMember("Kai", flightCrewJob3, 70000.0f);

        Ticket planeTicket = new PlaneTicket(1, "New York, NY, USA", "Miami, FL, USA", "1234", 100.0, true);
        Ticket busTicket = new BusTicket(2, "Freehold, NJ, USA", "Philadelphia, PA, USA", "5432", 50.0);

        String[] luggage1 = {"one", "two", "three"};
        Passenger passenger57 = new Passenger("Kyle", planeTicket, 1000.0, luggage1);
        System.out.println(passenger57.getAmtOfLuggage());
        String[] luggage2 = {"one", "two"};
        Passenger passenger07 = new Passenger("Kenneth", busTicket, 800.0, luggage2);
        passenger07.printTicket();

        crewMember3.serve(passenger57);

        FlightApp printOutMethods = new FlightApp();
        IPayable[] payableThings = {planeTicket, busTicket, crewMember1, crewMember2, crewMember3};
        printOutMethods.printAmountForEachThingThatIsPayable(payableThings);

        ArrayList<FlightCrewJob> addNewJobs = new ArrayList<>();
        addNewJobs.add(flightCrewJob3);
        addNewJobs.add(flightCrewJob1);
        addNewJobs.add(flightCrewJob2);

        printOutMethods.printEachFlightCrewJob(addNewJobs);

        printOutMethods.sortAndPrintCrewMembersByJob(addNewJobs);

        printOutMethods.printAllJobsExceptThisCrewMemberJob(addNewJobs, crewMember1);
    }
}
