package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, Kurangi belanja anda");
        }else {
            System.out.println("Uang Cukup, Selamat menikmati");
        }
    }
}
