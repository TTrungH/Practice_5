public class Client {
    public static void main(String[] args) {
        Longterm sign1 = new Longterm("1", "1", "1", 10);
        Shortterm sign2 = new Shortterm("2", "2", "2", 3);

        Permanent sign3 = new Permanent("3", "3", "3", 100);
        System.out.println(sign1);
        System.out.println(sign2);
        System.out.println(sign3);

    }
}
