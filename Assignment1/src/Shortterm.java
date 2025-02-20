public class Shortterm extends RentalContract {
    String contractID;
    String tenantID;
    String propertyID;
    double rentAmount;

    public Shortterm(String contractID, String tenantID, String propertyID, double rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
    }
}
