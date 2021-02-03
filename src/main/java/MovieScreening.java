import java.time.LocalDateTime;

public class MovieScreening {
    //attributes
    private LocalDateTime dateAndTime;
    private double pricePerSeat;

    //constructor

    public MovieScreening(Movie movie, LocalDateTime dateAndTime, double pricePerSeat) {
        this.dateAndTime = dateAndTime;
        this.pricePerSeat = pricePerSeat;
    }

    //methods

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
