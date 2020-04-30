package percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Pelanggan   : \"Bakso 1 bang\"");
                System.out.println("Kang Bakso  : \"Oke Broo\"");
            case 'B':
                System.out.println("Pelanggan   : \"Mie Ayam ga pake ayam bang\"");
                System.out.println("Kang Bakso  : \"wait a minute ??\"");
            case 'C':
                System.out.println("Pelanggan   : \"Nasi goreng bakso 1 bang\"");
                System.out.println("Kang Bakso  : \"Nasi goreng gak ada, bakso yg ada\"");
                System.out.println("Pelanggan   : \"Yaudah Baksonya digoreng\"");
            default:
                System.out.println("Pelanggan   : \"Bakso 1 bang\"");
                System.out.println("Kang Bakso  : \"Oke Broo\"");
                System.out.println("Pelanggan   : \"Tapi ngutang Awokwokwok\"");
                System.out.println("Kang Bakso  : \"!@#$%^&\"");
        }
    }
}