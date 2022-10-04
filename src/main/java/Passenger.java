import java.util.Arrays;

public class Passenger extends Person{
    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;

    public Passenger(String name, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

//    public int getAmtOfLuggage(String[] luggage){
//        int amount = 0;
//        for(int x = 0; x < luggage.length; x++){
//            amount = x + 1;
//        }
//        return amount;
//    }

    public int getAmtOfLuggage(){
        int amount = 0;
        for(int x = 0; x < this.luggage.length; x++){
            amount = x + 1;
        }
        return amount;
    }

    public void printTicket(){
        System.out.println(this.ticket);
    }
}
