public class Booking {
    private int id;
    private String type;
    private String customerName;
    private String details;
    private String status;

    public Booking(int id, String type, String customerName, String details, String status) {
        this.id = id;
        this.type = type;
        this.customerName = customerName;
        this.details = details;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDetails() {
        return details;
    }

    public String getStatus() {
        return status;
    }
}