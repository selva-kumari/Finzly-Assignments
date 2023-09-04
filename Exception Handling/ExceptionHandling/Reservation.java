package ExceptionHandling;
class Reservation {
    private Guest guest;
    private String reservationType;

    public Reservation(Guest guest, String reservationType) {
        this.guest = guest;
        this.reservationType = reservationType;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getReservationType() {
        return reservationType;
    }
}