public class Longterm extends RentalContract {
    String contractID;
    String tenantID;
    String propertyID;
    double rentAmount;

    public Longterm(String contractID, String tenantID, String propertyID, double rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
    }
}
