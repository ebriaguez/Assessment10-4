import java.util.ArrayList;
import java.util.Arrays;

public class FlightApp {
    public void printEachFlightCrewJob(ArrayList<FlightCrewJob> jobs){
        for(FlightCrewJob placeHolder : jobs){
            System.out.println(placeHolder);
        }
    }

    public void printAmountForEachThingThatIsPayable(IPayable[] payable){
        for(int x = 0; x < payable.length; x++){
            System.out.println(payable[x]);
        }

    }

    public void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> sort){
        for(FlightCrewJob placeHolder : sort){
        }
    }

    public void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> p, CrewMember s){}
}
