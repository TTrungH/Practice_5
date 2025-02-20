public class Contract {
    String contractID;
    String tenantID;
    String propertyID;
    double rentAmount;

    public Contract(String contractID, String tenantID, String propertyID, double rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
    }

}