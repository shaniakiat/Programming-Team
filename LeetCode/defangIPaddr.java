public class defangIPaddr {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        String newAddress = address.replace(".", "[.]");
        System.out.println(newAddress);

    }
}