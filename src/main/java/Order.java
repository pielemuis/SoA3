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

//        public void addSeatReservation(MovieTicket ticket){
//
//        }

//        public double calculatePrice(){
//            return;
//        }

//    public void export(TicketExportFormat exportFormat){
//
//    }

}