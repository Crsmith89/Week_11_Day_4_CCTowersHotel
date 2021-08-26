public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public int calculateBill(){
        return this.bedroom.getNightlyRate() * nightsBooked;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }
}

