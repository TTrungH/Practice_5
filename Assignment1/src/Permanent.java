public class Permanent extends RentalContract{
    String contractID;
    String tenantID;
    String propertyID;
    double rentAmount;

    public Permanent(String contractID, String tenantID, String propertyID, double rentAmount) {
        buildContractID(contractID);
        buildPropertyID(propertyID);
        buildRentAmount(rentAmount);
        buildTenantID(tenantID);
    }

    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;
    }
    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract signContract(){
        return new Contract(this.contractID, this.tenantID, this.propertyID, this.rentAmount);
    }
    @Override
    public String toString() {
        return "ContractID: " + contractID + ", PropertyID: " + propertyID + ", TenantID: " + tenantID + ", RentAmount: " + rentAmount;
    }
}