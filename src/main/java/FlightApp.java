import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FlightApp {
    public void printEachFlightCrewJob(ArrayList<FlightCrewJob> jobs){
        for(FlightCrewJob placeHolder : jobs){
            System.out.println(placeHolder);
        }
    }

    public void printAmountForEachThingThatIsPayable(IPayable[] payable){
        for(IPayable placeHolder : payable){
            System.out.println(placeHolder);
        }
    }

    public void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> sort){
        Collections.sort(sort, new sortingComparator());
        for(FlightCrewJob placeHolder : sort){
            System.out.println(placeHolder);
        }
    }

    public void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> job, CrewMember member){
        for(FlightCrewJob placeHolder : job){
            if(job.contains(FlightCrewJob.PILOT)){
                job.remove(member);
            }
            System.out.println(placeHolder);
        }
    }
}
