import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractId = sc.nextLine();
        String tenantId = sc.nextLine();
        String propertyId = sc.nextLine();
        double rentAmount = sc.nextDouble();
        Longterm sign1 = new Longterm(contractId, tenantId, propertyId, rentAmount);

        // Shortterm sign2 = new Shortterm(contractId, tenantId, propertyId, rentAmount);

        // Permanent sign3 = new Permanent(contractId, tenantId, propertyId, rentAmount);
        

        System.out.println(sign1);


    }
}
