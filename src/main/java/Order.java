import java.time.LocalDateTime;

public class Order {

    //attributes
    private int orderNr;
    private boolean isStudentOrder;

    //constructor
    public Order(int orderNr, boolean isStudentOrder) {
        this.orderNr = orderNr;
        this.isStudentOrder = isStudentOrder;
    }

    //methods
    public int getOrder() {
        return orderNr;
    }

    public void addSeatReservation(MovieTicket ticket){

    }

    public double calculatePrice(){
        //TODO: Get base price for ticket
        //TODO: Get screening date & day of week
        //TODO: Check if premium ticket

        return 69;
    }

    public void export(TicketExportFormat exportFormat){

    }

}