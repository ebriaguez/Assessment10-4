import java.util.Comparator;

public class sortingComparator implements Comparator<FlightCrewJob> {
    @Override
    public int compare(FlightCrewJob p1, FlightCrewJob p2) {
        if(p1.getIndexPosition() > p2.getIndexPosition()){
            return 1;
        }
        return -1;
    }
}
