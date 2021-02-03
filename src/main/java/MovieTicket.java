public class MovieTicket {

    //attributes
    private int rowNr;
    private int seatNr;
    private boolean isPremium;

    //constructor

    public MovieTicket(MovieScreening movieScreening, boolean isPremiumReservation, int seatRow, int seatNr) {
        this.rowNr = seatRow;
        this.seatNr = seatNr;
        this.isPremium = isPremiumReservation;
    }

    //methods
    public boolean isPremiumTicket() {
        return isPremium;
    }

//    public double getPrice(){
//
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}
